package org.provinggrounds.SevenElevenDoubles.Game;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Should be used to process user commands. Call method processCommand().
 */
public final class CommandProcessor {

    /**
     * Process user's commands
     * @param userCommand Command to be processed. Pass entire command line in a single String.
     *                    If null, empty or invalid, no action is taken
     */
    public static void processCommand(String userCommand) {
        //no action taken for invalid input
        if(userCommand == null || userCommand.isEmpty()) return;

        //Parse input command line into command and arguments
        String[] commandWords = userCommand.split(" ", 2);
        if(commandWords.length < 1)
            return;
        String command = commandWords[0];
        List<String> arguments = Collections.emptyList();
        if(commandWords.length >= 2) {  //arguments exist
            arguments.addAll(Arrays.asList(commandWords[1].split(" ")));
        }

        //Examine first word - if valid command word, execute command

        //Else return without doing anything
    }
}
