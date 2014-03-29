package org.provinggrounds.SevenElevenDoubles;

import org.provinggrounds.SevenElevenDoubles.Game.CommandProcessor;
import org.provinggrounds.SevenElevenDoubles.Game.GameFactory;

import java.io.Console;
import java.util.List;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public final class MainProgram {

    private static final String helpTextResourceFile = "HelpText";
    private static final String RESOURCE_DIR = "./res/resources/";

    public static void main(String args[]) {
        printHelpText();
        //accept commands from players
        processUserCommands();
        //setup game
        //start game
    }

    /**
     * Accept commands from user and process them
     */
    private static void processUserCommands() {
        //until game needs to be started, keep accepting and processing commands
        boolean keepProcessingUserCommands = true;
        final Console console = System.console();
        while (keepProcessingUserCommands) {
            //display prompt
            System.out.print(">");
            //read user command
            String userCommand = console.readLine();
            //parse command
            CommandProcessor.processCommand(userCommand);
            //if game is ready to start (when numPlayers>=2 and start command was given)
            if (GameFactory.gameStartSignalled()) {
                keepProcessingUserCommands = false;
                break;
            }
        }
    }

    /**
     * Prints help text to screen
     */
    private static void printHelpText() {
        System.out.println();
        try {
            List<String> helpTextLines = Files.readAllLines(Paths.get(RESOURCE_DIR + helpTextResourceFile), StandardCharsets.UTF_8);
            for (String lineOfText : helpTextLines) {
                System.out.println(lineOfText);
            }
        } catch (IOException e) {
            System.out.println("Failed to read help text from file: ");
            System.out.println(e);
        }
        System.out.println();
        System.out.println("Waiting for players...");
    }
}
