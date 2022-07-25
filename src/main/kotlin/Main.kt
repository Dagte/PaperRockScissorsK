import com.kotlin.rockpaperscissors.DefaultArgumentParser
import com.kotlin.rockpaperscissors.Shape

fun main(args: Array<String>) {
    if (args == null) {
        println("You have not provided any arguments!");
    } else {
        println("There are " + args.size + " argument(s)!");
        for (i in args.indices) {
            println("Argument(" + (i + 1) + "):" + args[i]);
        }
    }

    val shapes: List<Shape> = DefaultArgumentParser().parse(args)
    shapes.forEach { shape -> printMessage(shape.playPaperRockScissors()) }


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
