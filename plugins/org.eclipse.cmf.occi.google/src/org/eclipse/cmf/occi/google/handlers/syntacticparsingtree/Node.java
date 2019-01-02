package org.eclipse.cmf.occi.google.handlers.syntacticparsingtree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Node {

    public String value;
    public NodeType type;
    public Node parent;
    public List<Node> children;

    public Node() {
        this.children = new ArrayList<>();
        this.parent = null;
        this.type = NodeType.ROOT;
    }

    public Node(Node parent) {
        this.children = new ArrayList<>();
        this.parent = parent;
    }

    private static final String ROOT_NODE = "ROOT";

    private static String[] preprocessSyntacticTree(String syntacticParseTree) {
        return syntacticParseTree.substring(("(" + ROOT_NODE).length())
                .replaceAll("\n", "")
                .replaceAll("\\(", " ( ")
                .replaceAll("\\)", " ) ")
                .trim().replaceAll(" +", " ")
                .split(" ");
    }

    @Override
    public String toString() {
        return "(" + this.type.name()
                + (this.value != null ? " " + this.value : "")
                + this.children.stream()
                .map(Node::toString)
                .collect(Collectors.joining(" "))
                + ")";
    }

    public boolean isRoot() {
        return this.type == NodeType.ROOT && this.parent == null;
    }

    public Node getFirstParentOfGivenTypeAndMatchPredicates(NodeType type, Predicate<Node>... additionalPredicates) {
        Node currentParent = this.parent;
        while (!currentParent.isRoot()) {
            if (currentParent.match(type, additionalPredicates)) {
                return currentParent;
            } else {
                currentParent = currentParent.parent;
            }
        }
        return null;
    }

    public boolean match(NodeType type, Predicate<Node>... additionalPredicates) {
        return this.type == type &&
                Arrays.stream(additionalPredicates)
                        .allMatch(nodePredicate -> nodePredicate.test(this));
    }

    public boolean isSibling(Node node) {
        return node.type == this.type && node.parent.equals(this.parent);
    }

    @Override
    public boolean equals(Object o) {
        return this == o;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, type, parent, children);
    }

    public boolean isChildOf(NodeType type) {
        Node currentParent = this.parent;
        while (!currentParent.isRoot()) {
            if (currentParent.type == type) {
                return true;
            } else {
                currentParent = currentParent.parent;
            }
        }
        return false;
    }

    public List<Node> findSpecificTypeOfNodeInChildren(NodeType type, Predicate<Node>... additionalPredicates) {
        List<Node> nodesWithSpecificType = this.children.stream()
                .flatMap(child -> child.findSpecificTypeOfNodeInChildren(type, additionalPredicates).stream())
                .collect(Collectors.toList());
        if (this.match(type, additionalPredicates)) {
            nodesWithSpecificType.add(this);
        }
        return nodesWithSpecificType;
    }

    // BUILDER
    public static Node buildTreeFromString(final String syntacticParseTree) {
        final Node root = new Node();
        Node current = root;
        if (!syntacticParseTree.startsWith("(" + ROOT_NODE)) {
            throw new RuntimeException("the given string should always start with (" + ROOT_NODE);
        }
        final String[] preprocessSyntacticTree = preprocessSyntacticTree(syntacticParseTree);
        for (String word : preprocessSyntacticTree) {
            if ("(".equals(word)) {
                final Node newNode = new Node(current);
                current.children.add(newNode);
                current = newNode;
            } else if (")".equals(word)) {
                current = current.parent;
            } else if (NodeType.isANodeType(word)) {
                current.type = NodeType._valueOf(word);
            } else { // this a word of the sentence.
                current.value = word;
            }
        }
        return root;
    }

    public void merge(Node copyNode) {
        if (!this.isSibling(copyNode)) {
            return;
        } else {
            this.parent.children.remove(copyNode);
            this.value += " " + copyNode.value;
        }
    }
}