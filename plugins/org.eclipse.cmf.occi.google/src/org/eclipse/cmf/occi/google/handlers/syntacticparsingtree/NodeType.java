package org.eclipse.cmf.occi.google.handlers.syntacticparsingtree;

public enum NodeType {

    ROOT,
    NP,
    NNP,
    NN,
    PP,
    IN,
    DT,
    ADJP,
    JJ,
    CC,
    TO,
    WHNP,
    WDT,
    VP,
    VBZ,
    S,
    SBAR,
    MD,
    VB,
    VBN,
    VBD,
    VBP,
    RB,
    NNS,
    SYM,
    COMMA,
    DOT;

    public static NodeType _valueOf(String candidate) {
        try {
            return NodeType.valueOf(candidate);
        } catch (IllegalArgumentException e) {
            switch (candidate) {
                case ",":
                    return NodeType.COMMA;
                case ".":
                    return NodeType.DOT;
                default:
                	//System.err.println(candidate);
                    throw e;
            }
        }
    }

    public static boolean isANodeType(String candidate) {
        try {
            NodeType._valueOf(candidate);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}