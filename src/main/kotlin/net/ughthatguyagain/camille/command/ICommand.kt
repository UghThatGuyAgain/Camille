package net.ughthatguyagain.camille.command

import net.dv8tion.jda.core.events.message.MessageReceivedEvent

interface ICommand<String> {
    fun execute(args: List<String>, event: MessageReceivedEvent)
    val name: String
    val arguments: Boolean
    val description: String
}