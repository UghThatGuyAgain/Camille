package net.ughthatguyagain.camille.command

import com.merakianalytics.orianna.Orianna
import com.merakianalytics.orianna.types.common.Region

import net.ughthatguyagain.camille.command.commands.Test
import net.ughthatguyagain.camille.command.commands.ArgsTest
import net.ughthatguyagain.camille.command.commands.TestApi

class CommandBuilder(val commands: HashMap<String, ICommand<String>> =  HashMap()) {
    init {
        Orianna.setRiotAPIKey("RGAPI-0f81eb3e-c8d7-48f6-a797-42b68862733c")
        Orianna.setDefaultRegion(Region.NORTH_AMERICA)
        commands["test"] = Test()
        commands["argstest"] = ArgsTest()
        commands["testapi"] = TestApi()
    }

}