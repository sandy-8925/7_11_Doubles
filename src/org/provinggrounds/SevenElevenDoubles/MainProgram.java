package org.provinggrounds.SevenElevenDoubles;

import java.util.List;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public final class MainProgram {

  private static final String helpTextResourceFile = "HelpText";
  private static final String RESOURCE_DIR = "./resources/";

  public static void main(String args[]) {
    printHelpText();
  }

  private static void printHelpText() {
    System.out.println();
    try {
    List<String> helpTextLines = Files.readAllLines(Paths.get(RESOURCE_DIR + helpTextResourceFile), StandardCharsets.UTF_8);
    for(String lineOfText : helpTextLines) {
      System.out.println(lineOfText);
    }
    }
    catch(IOException e) {
      System.out.println("Failed to read help text from file: ");
      System.out.println(e);
    }
    System.out.println();
    System.out.println("Waiting for players...");
  }
}
