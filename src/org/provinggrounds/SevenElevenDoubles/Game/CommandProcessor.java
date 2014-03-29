package org.provinggrounds.SevenElevenDoubles.Game;

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

    }
}
