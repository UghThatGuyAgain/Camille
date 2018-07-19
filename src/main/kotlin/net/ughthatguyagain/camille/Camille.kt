package net.ughthatguyagain.camille

import net.dv8tion.jda.core.AccountType
import net.dv8tion.jda.core.JDABuilder

import net.ughthatguyagain.camille.command.CommandHandler

fun main(args: Array<String>) {
    val config = Config()
    val jda = JDABuilder(AccountType.BOT)
            .setToken(config.token)
            .addEventListener(CommandHandler())
            .buildBlocking()
}


