package net.ughthatguyagain.camille.command

import com.merakianalytics.orianna.Orianna
import com.merakianalytics.orianna.types.common.Region
import net.ughthatguyagain.camille.Config

import net.ughthatguyagain.camille.command.commands.Test
import net.ughthatguyagain.camille.command.commands.ArgsTest
import net.ughthatguyagain.camille.command.commands.Summoner
import net.ughthatguyagain.camille.command.commands.TestApi

class CommandBuilder(val commands: HashMap<String, ICommand<String>> =  HashMap()) {
    init {

        commands["test"] = Test()
        commands["argstest"] = ArgsTest()
        commands["testapi"] = TestApi()
        commands["summoner"] = Summoner()

        println("Commands loaded.")
    }

}