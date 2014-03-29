package org.provinggrounds.SevenElevenDoubles.Game;

import org.provinggrounds.SevenElevenDoubles.MainProgram;

import java.util.List;

/**
 *  Implements the 'help' command
 */
final class HelpCommandHandler implements CommandHandler {
    @Override
    public void execute(List<String> arguments) {
        MainProgram.printHelpText();
    }
}
