package org.eclipse.cmf.occi.google.handlers.syntacticparsingtree;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SyntacticParserTree {

    public static LinkDefinition run(String text) {

        final File tempFileWithContentToParse = createTempFileWithContentToParse(text);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps
                = new PrintStream(baos);
        PrintStream old = System.out;
        System.setOut(ps);
        edu.stanford.nlp.parser.lexparser.LexicalizedParser.main(
                new String[]{
                        "-outputFormat",
                        "penn",
                        "edu/stanford/nlp/models/lexparser/englishPCFG.ser.gz",
                        tempFileWithContentToParse.getAbsolutePath()
                }
        );
        System.out.flush();
        System.setOut(old);
        final String[] output = baos.toString().split("\\(ROOT");
        final List<Node> trees = Arrays.stream(output)
                .map(tree -> "(ROOT" + tree)
                .map(Node::buildTreeFromString)
                .collect(Collectors.toList());
        
        return trees.stream()
                        .map(LinkDefinition::build)
                        .filter(linkDefinition -> !linkDefinition.isEmpty())
                        .findAny()
                        .orElse(null);
    }

    private static File createTempFileWithContentToParse(final String text) {
        try {
            final File tempFile = File.createTempFile("text-to-parse", ".txt");
            FileWriter writer = new FileWriter(tempFile.getAbsolutePath(), false);
            writer.write(text);
            writer.close();
            return tempFile;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
