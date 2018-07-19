package net.ughthatguyagain.camille.command

import net.dv8tion.jda.core.events.message.MessageReceivedEvent
import net.dv8tion.jda.core.hooks.ListenerAdapter

class CommandHandler(private val commandBuilder: CommandBuilder = CommandBuilder()): ListenerAdapter() {
    override fun onMessageReceived(event: MessageReceivedEvent) {
        if(event.author.isBot) return
        val message = event.message.contentRaw
        println(message)
        commandBuilder.commands[message]!!.execute()
    }
}