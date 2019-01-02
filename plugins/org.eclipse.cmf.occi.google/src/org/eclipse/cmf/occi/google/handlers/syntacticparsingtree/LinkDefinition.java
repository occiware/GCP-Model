package org.eclipse.cmf.occi.google.handlers.syntacticparsingtree;

import java.util.ArrayList;
import java.util.List;

public class LinkDefinition {

    public String link;

    public String target;

    public String source;

    public static LinkDefinition build(Node tree) {
        // we try to match the following pattern:
        // there is a NNP with a value
        // AND there is two PP IN that point on each NN.

        // first, find the NNP with URL as value.
        final List<Node> candidateOfLink = tree.findSpecificTypeOfNodeInChildren(NodeType.NNP,
                node -> "URL".equals(node.value.toUpperCase())
        );
        if (candidateOfLink.isEmpty()) {
            return LinkDefinition.buildEmpty();
        }
        final String link = candidateOfLink.get(0).value;

        // second, find the target and the source
        final List<Node> candidatesOfSourcesOrTarget = tree.findSpecificTypeOfNodeInChildren(NodeType.NN,
                node -> node.isChildOf(NodeType.PP) && !(node.isChildOf(NodeType.TO))
        );

        final List<Node> mergedSiblings =
                mergeSibling(candidatesOfSourcesOrTarget);

        if (mergedSiblings.size() < 2) {
            return LinkDefinition.buildEmpty();
        }

        System.out.println(mergedSiblings);

        Node target = findNodeWithSpecificValue(mergedSiblings, "of");
        Node source;
        if (target == null) {
            source = findNodeWithSpecificValue(mergedSiblings, "for");
            if (source == null) {
                return LinkDefinition.buildEmpty();
            }
            mergedSiblings.remove(source);
            target = mergedSiblings.get(0);
        } else {
            mergedSiblings.remove(target);
            source = mergedSiblings.get(0);
        }

        return new LinkDefinition(link, target.value, source.value);
    }

    public static Node findNodeWithSpecificValue(List<Node> potentialNodes, String value) {
        return potentialNodes.stream()
                .filter(node ->
                        node.getFirstParentOfGivenTypeAndMatchPredicates(NodeType.PP,
                                parent ->
                                        !parent.findSpecificTypeOfNodeInChildren(NodeType.IN,
                                                child -> value.equals(child.value)
                                        ).isEmpty()
                        ) != null
                ).findFirst()
                .orElse(null);
    }

    public static List<Node> mergeSibling(List<Node> nodes) {
        List<Node> mergedSiblings = new ArrayList<>();
        final List<Node> copyNodes = new ArrayList<>(nodes);
        while (!copyNodes.isEmpty()) {
            final Node node = copyNodes.get(0);
            copyNodes.remove(node);
            final List<Node> toBeIterated = new ArrayList<>(copyNodes);
            for (Node copyNode : toBeIterated) {
                if (node.isSibling(copyNode)) {
                    node.merge(copyNode);
                    copyNodes.remove(copyNode);
                }
            }
            mergedSiblings.add(node);
        }
        return mergedSiblings;
    }

    public static LinkDefinition buildEmpty() {
        return new LinkDefinition("", "", "");
    }

    private LinkDefinition(String link, String target, String source) {
        this.link = link;
        this.target = target;
        this.source = source;
    }

    public boolean isEmpty() {
        return "".equals(this.link) &&
                "".equals(this.source) &&
                "".equals(this.target);
    }

    @Override
    public String toString() {
        return "Link("+ this.link +") between: src: " + this.source + " target: " + this.target ;
    }
}