package net.stckoverflw.adventofcode.day1

fun main() {
    val input = {}.javaClass.getResource("/input.txt")?.readText() ?: error("No input.txt in resources")

    val numbers = input.split("\\s+".toRegex()).mapTo(ArrayList()) { it.toInt() }

    val increasing = numbers.windowed(3).mapTo(ArrayList()) {
        it[0] + it[1] + it[2]
    }.windowed(2).count { it[0] < it[1] }

    println(increasing)
}