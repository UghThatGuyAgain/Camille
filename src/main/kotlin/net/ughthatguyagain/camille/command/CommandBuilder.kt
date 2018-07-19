package net.ughthatguyagain.camille.command

import net.ughthatguyagain.camille.command.commands.test

class CommandBuilder(val commands: HashMap<String, Command> =  HashMap<String, Command>()) {
    init {
        commands["test"] = Command("test", test())
    }

}