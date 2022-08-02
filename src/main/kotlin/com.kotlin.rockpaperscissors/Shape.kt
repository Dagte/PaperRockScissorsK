//package com.kotlin.rockpaperscissors
//
//import kotlin.random.Random
//
//enum class Shape {
//    PAPER, ROCK, SCISSORS;
//
//    fun playPaperRockScissors(): Int {
//        val anotherShape: Shape = randomShape()
//        return if (this == PAPER) {
//            playHavingPaper(anotherShape)
//        } else if (this == ROCK) {
//            playHavingRock(anotherShape)
//        } else {
//            playHavingScissors(anotherShape)
//        }
//    }
//
//    private fun playHavingPaper(shape: Shape): Int {
//        return if (shape == ROCK) -1 else if (shape == PAPER) 0 else 1
//    }
//
//    private fun playHavingRock(shape: Shape): Int {
//        return if (shape == ROCK) 0 else if (shape == PAPER) 1 else -1
//    }
//
//    private fun playHavingScissors(shape: Shape): Int {
//        return if (shape == ROCK) -1 else if (shape == PAPER) 1 else 0
//    }
//
//    private fun randomShape() = Shape.values()[Random.nextInt(Shape.values().size)]
//}