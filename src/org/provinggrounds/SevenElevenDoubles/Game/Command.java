package org.provinggrounds.SevenElevenDoubles.Game;

import java.util.List;

/**
 *  A common interface for individual command handlers.
 *  (e.g) 'help' command will have one handler, 'speed' command another handler
 */
interface Command {
    /**
     * Perform the operations for this command
     * @param arguments A collection of arguments for this command, in the order entered by the user.
     */
    void execute(List<String> arguments);
}
