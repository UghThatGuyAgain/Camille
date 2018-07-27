package net.ughthatguyagain.camille.command

import com.merakianalytics.orianna.Orianna
import com.merakianalytics.orianna.datapipeline.riotapi.exceptions.NotFoundException
import com.merakianalytics.orianna.types.common.OriannaException
import com.merakianalytics.orianna.types.common.Region
import com.merakianalytics.orianna.types.core.summoner.Summoner
import net.dv8tion.jda.core.events.message.MessageReceivedEvent

class APIWrapper {
    fun summonerByName(name: String, region: String, event: MessageReceivedEvent): Summoner? {
        try {
            Orianna.setDefaultRegion(convertRegion(region))
            return Orianna.summonerNamed(name).get()
        } catch(error: OriannaException) {
            error(error, event)
            return null
        }
    }
    private fun error(e: OriannaException, event: MessageReceivedEvent) {
        when(e) {
            is NotFoundException -> {
                val mB = MessageBuilder()
                mB.mB.setTitle("Uh oh!").setDescription("The summoner requested can't be found. Is he hiding?")
                mB.sendMessage(event)
            }
        }
    }
    private fun convertRegion(region: String): Region {
        return when(region) {
            "br", "brazil" -> Region.BRAZIL
            "euw" -> Region.EUROPE_WEST
            "eune" -> Region.EUROPE_NORTH_EAST
            "jp", "japan" -> Region.JAPAN
            "kr", "korea" -> Region.KOREA
            "lan" -> Region.LATIN_AMERICA_NORTH
            "las" -> Region.LATIN_AMERICA_SOUTH
            "na", "na1" -> Region.NORTH_AMERICA
            "oce", "oceania" -> Region.OCEANIA
            "tr", "turkey" -> Region.TURKEY
            "ru", "russia" -> Region.RUSSIA
            else -> Region.NORTH_AMERICA
        }

    }
}