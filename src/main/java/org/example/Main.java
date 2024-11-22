package org.example;

import java.io.File;
import java.nio.file.Files;

public class Main {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Error: No input file given");
        }
        File inputFile = new File(args[0]);
        for (String line : Files.readAllLines(inputFile.toPath())) {
            String[] lineParts = line.split("\t");

            if (lineParts[0].equals("ToImage")) {
                // TODO: Handle
            }
            else if (lineParts[0].equals("ToHTML")) {
                // TODO: Handle
            }
            else if (lineParts[0].equals("ToText")) {
                // TODO: Handle
            }
        }

    }
}