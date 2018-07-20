package net.ughthatguyagain.camille.command.commands

import net.ughthatguyagain.camille.command.ICommand
import net.ughthatguyagain.camille.command.MessageBuilder

class Test: ICommand<String> {
    override val name: String = "test"
    override val arguments = false
    override val description = "Test that will probably be removed"
    override fun execute(args: List<String>) {

    }
}