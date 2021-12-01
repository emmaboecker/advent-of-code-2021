package net.stckoverflw.adventofcode.day1

fun main() {
    val input = {}.javaClass.getResource("/input.txt")?.readText() ?: error("No input.txt in resources")

    val numbers = input.split("\\s+".toRegex()).mapTo(ArrayList()) { it.toInt() }

    println(numbers.windowed(2).count { it[0] < it[1] })
}