package org.provinggrounds.SevenElevenDoubles.Game;

import java.util.*;

/**
 * Should be used to process user commands. Call method processCommand().
 */
public final class CommandProcessor {

    private static Map<String, CommandHandler> commandMap;

    static {
        //initialize commandMap
        commandMap = new HashMap<>();
        commandMap.put("help", new HelpCommandHandler());
    }

    /**
     * Process user's commands
     * @param userCommand CommandHandler to be processed. Pass entire command line in a single String.
     *                    If null, empty or invalid, no action is taken
     */
    public static void processCommand(String userCommand) {
        //no action taken for invalid input
        if(userCommand == null || userCommand.isEmpty()) return;

        //Parse input command line into command and arguments
        String[] commandWords = userCommand.split(" ", 2);
        if(commandWords.length < 1)
            return;
        String command = commandWords[0].toLowerCase(); //input command should be recognized independent of case
        List<String> arguments = Collections.emptyList();
        if(commandWords.length >= 2) {  //arguments exist
            arguments = Arrays.asList(commandWords[1].split(" "));
        }

        //filter out empty strings in arguments
        ListIterator<String> argsIterator = arguments.listIterator();
        while(argsIterator.hasNext()) {
            if(argsIterator.next().isEmpty())
                argsIterator.remove();
        }

        //Examine first word - if valid command word, execute command
        if(commandMap.containsKey(command)) {
            commandMap.get(command).execute(arguments);
        }

        //Else return without doing anything
    }
}
