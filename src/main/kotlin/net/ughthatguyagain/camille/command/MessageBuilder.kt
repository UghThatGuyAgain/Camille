package net.ughthatguyagain.camille.command

import net.dv8tion.jda.core.EmbedBuilder

// mB stands for messageBuilder
class MessageBuilder(val mB: EmbedBuilder = EmbedBuilder().setColor(0x203843).clearFields().setTitle(null).setDescription(null))