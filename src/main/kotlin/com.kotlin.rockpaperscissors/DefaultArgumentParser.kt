package com.kotlin.rockpaperscissors

import java.util.*

class DefaultArgumentParser : ArgumentParser {

    private val validArguments = mapOf(
        Pair("s", Shape.SCISSORS),
        Pair("scissors", Shape.SCISSORS),
        Pair("p", Shape.PAPER),
        Pair("paper", Shape.PAPER),
        Pair("r", Shape.ROCK),
        Pair("rock", Shape.ROCK)
    )

    override fun parse(args: Array<String>): List<Shape> {
        val shapes = mutableListOf<Shape>()
        if (args === null) {
            throw RuntimeException("There should be some args")
        }
        if (args.size > 6) {
            throw RuntimeException("Player should only make one move at the time")
        }
        for (arg in args) {
            val argument = arg.lowercase(Locale.getDefault())
            if (!validArguments.containsKey(argument)) {
                throw RuntimeException("Player should make a valid move")
            }
            shapes.add(checkNotNull(validArguments[argument]))
        }
        return shapes;
    }
}