package net.ughthatguyagain.camille.command

import net.dv8tion.jda.core.events.message.MessageReceivedEvent
import net.dv8tion.jda.core.hooks.ListenerAdapter

class CommandHandler(private val commandBuilder: CommandBuilder = CommandBuilder()): ListenerAdapter() {
    override fun onMessageReceived(event: MessageReceivedEvent) {
        if(event.author.isBot) return
        val message: String = event.message.contentRaw

        if(message.split("")[1] + message.split("")[2] != "c.") return

        val cutPrefix = message.split("").drop(3).joinToString("").toLowerCase()

        if(commandBuilder.commands[cutPrefix.split(" ")[0]]!!.arguments) {
            val arguments: List<String> = cutPrefix.split(" ").drop(1).take(2)
            val commandName: String = cutPrefix.split(" ")[0]
            try {
                commandBuilder.commands[commandName]!!.execute(arguments, event)
                return
            } catch(e: KotlinNullPointerException) {
                println(e)
            }
        }
        val noArgs = arrayListOf("")
        commandBuilder.commands[cutPrefix]!!.execute(noArgs, event)
    }
}