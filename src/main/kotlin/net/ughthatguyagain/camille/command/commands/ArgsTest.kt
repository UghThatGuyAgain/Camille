package net.ughthatguyagain.camille.command.commands

import net.dv8tion.jda.core.events.message.MessageReceivedEvent
import net.ughthatguyagain.camille.command.ICommand

class ArgsTest: ICommand<String> {
    override val name = "argsTest"
    override val arguments = true
    override val description = "Test for seeing if arguments work"
    override fun execute(args: List<String>, event: MessageReceivedEvent) {
        println(args[0])
    }
}