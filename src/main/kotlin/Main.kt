import com.kotlin.rockpaperscissors.DefaultArgumentParser
import io.github.dagte.simulator.Shape

fun main(args: Array<String>) {
    if (args == null) {
        println("You have not provided any arguments!");
    } else {
        println("There are " + args.size + " argument(s)!");
        for (i in args.indices) {
            println("Argument(" + (i + 1) + "):" + args[i]);
        }
    }

    val results: MutableList<Int> = mutableListOf()
    val shapes: List<Shape> = DefaultArgumentParser().parse(args)
    shapes.forEach { shape ->
        var result = shape.playPaperRockScissors()
        printMessage(result)
        results.add(result)
    }
    calculateAndPrintroundResult(results)

}

private fun calculateAndPrintroundResult(results: MutableList<Int>): Int {
    val reduced = results.reduce { x, y -> x + y }
    if (reduced > 0) {
        println("Congratulations, you won this round by $reduced points")
    } else {
        println("Sorry, you lost this round by ${Math.abs(reduced)} points")
    }
    return reduced
}

fun printMessage(result: Int) {
    if (result == 1) {
        println("Congratulations, you won")
    }
    if (result == 0) {
        println("That was a draw, try again")
    }
    if (result == -1) {
        println("Bad luck, you lost")
    }
}
