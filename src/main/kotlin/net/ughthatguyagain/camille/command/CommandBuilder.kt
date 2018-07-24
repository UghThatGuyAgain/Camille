package net.ughthatguyagain.camille.command

import com.merakianalytics.orianna.Orianna
import com.merakianalytics.orianna.types.common.Region

import net.ughthatguyagain.camille.command.commands.Test
import net.ughthatguyagain.camille.command.commands.ArgsTest
import net.ughthatguyagain.camille.command.commands.TestApi

class CommandBuilder(val commands: HashMap<String, ICommand<String>> =  HashMap()) {
    init {
        Orianna.setRiotAPIKey("RGAPI-8adb433a-ae4e-4a59-9a4d-e51f29ec135e")
        Orianna.setDefaultRegion(Region.NORTH_AMERICA)
        commands["test"] = Test()
        commands["argstest"] = ArgsTest()
        commands["testapi"] = TestApi()
    }

}