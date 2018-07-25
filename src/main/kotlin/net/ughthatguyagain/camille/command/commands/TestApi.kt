package net.ughthatguyagain.camille.command.commands

import com.merakianalytics.orianna.Orianna
import com.merakianalytics.orianna.types.common.Region
import net.dv8tion.jda.core.events.message.MessageReceivedEvent
import net.ughthatguyagain.camille.command.ICommand
import net.ughthatguyagain.camille.command.MessageBuilder

class TestApi: ICommand<String> {
    override val name = "testapi"
    override val arguments = true
    override val description = "lol xd"
    override fun execute(args: List<String>, event: MessageReceivedEvent) {
        Orianna.setDefaultRegion(Region.NORTH_AMERICA)
        val summoner = Orianna.summonerNamed(args[0]).get()
        val mB = MessageBuilder()
        mB.mB.setTitle("lol").setDescription(summoner.name)
        mB.sendMessage(event)
    }
}