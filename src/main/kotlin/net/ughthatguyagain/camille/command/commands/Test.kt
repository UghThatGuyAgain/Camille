package net.ughthatguyagain.camille.command.commands

import net.ughthatguyagain.camille.command.ICommand

class Test: ICommand<String> {
    override val name: String = "test"
    override val arguments = false
    override fun execute(args: List<String>) {
        println("test worked")
    }
}