package net.ughthatguyagain.camille.command.commands

import com.merakianalytics.orianna.Orianna
import net.dv8tion.jda.core.events.message.MessageReceivedEvent
import net.ughthatguyagain.camille.command.ICommand
import com.merakianalytics.orianna.types.common.Region

class Summoner: ICommand<String> {
    override val name = "summoner"
    override val arguments = true
    override val description = "Get info for a specified summoner by their name."
    override fun execute(args: List<String>, event: MessageReceivedEvent) {
        println("Summoner command executed")
        // Orianna.setDefaultRegion(convertRegion(args[1]))
        val summonerInfo = Orianna.summonerNamed(args[0]).get()
        // Fix this to send an error message, possibly with an error class
        // Checks to see if the summoner is not found or another error
        if(summonerInfo == null) return

        val matchlist = Orianna.matchHistoryForSummoner(summonerInfo).get()

        println(matchlist[0].participants.find(summonerInfo).champion)
    }

}

