package net.ughthatguyagain.camille.command

import net.ughthatguyagain.camille.command.commands.ArgsTest
import net.ughthatguyagain.camille.command.commands.Test


class CommandBuilder(val commands: HashMap<String, ICommand<String>> =  HashMap()) {
    init {
        commands["test"] = Test()
        commands["argstest"] = ArgsTest()
    }

}