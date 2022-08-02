package com.kotlin.rockpaperscissors

import io.github.dagte.simulator.Shape

interface ArgumentParser {
    fun parse(args: Array<String>): List<Shape>
}