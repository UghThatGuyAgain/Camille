package net.ughthatguyagain.camille.command

interface ICommand<String> {
    fun execute(args: List<String>)
    val name: String
    val arguments: Boolean
    val description: String
}