package com.kotlin.rockpaperscissors

interface ArgumentParser {
    fun parse(args: Array<String>): List<Shape>
}