package net.ughthatguyagain.camille.command.commands

import com.merakianalytics.orianna.Orianna
import net.dv8tion.jda.core.events.message.MessageReceivedEvent
import net.ughthatguyagain.camille.command.ICommand
import com.merakianalytics.orianna.types.common.Region
import net.ughthatguyagain.camille.command.APIWrapper

class Summoner: ICommand<String> {
    override val name = "summoner"
    override val arguments = true
    override val description = "Get info for a specified summoner by their name."
    override fun execute(args: List<String>, event: MessageReceivedEvent) {
        if(args.size <= 1) {
            return
        }
        println("Summoner command executed")
        val api = APIWrapper()
        // Orianna.setDefaultRegion(convertRegion(args[1]))
        val summonerInfo = api.summonerByName(args[0], args[1], event)

        val matchlist = Orianna.matchHistoryForSummoner(summonerInfo).get()

        println(matchlist[0].participants.find(summonerInfo).champion)
    }

}

