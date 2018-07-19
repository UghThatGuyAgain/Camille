package net.ughthatguyagain.camille.command.commands

import net.ughthatguyagain.camille.command.ICommand

class ArgsTest: ICommand<String> {
    override val name = "argsTest"
    override val arguments = true
    override fun execute(args: List<String>) {
        println(args[0])
    }
}