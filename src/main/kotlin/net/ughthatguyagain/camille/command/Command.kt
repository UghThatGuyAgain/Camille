package net.ughthatguyagain.camille.command

class Command(var name: String, private var function:  {
    fun execute(): Unit = function.invoke()
}