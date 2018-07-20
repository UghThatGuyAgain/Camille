package net.ughthatguyagain.camille.command.commands

import com.merakianalytics.orianna.Orianna
import net.ughthatguyagain.camille.command.ICommand

class TestApi: ICommand<String> {
    override val name = "testapi"
    override val arguments = false
    override val description = "lol xd"
    override fun execute(args: List<String>) {
        val summoner = Orianna.summonerNamed("UghThatGuyAgain").get()
        println(summoner.level)
    }
}