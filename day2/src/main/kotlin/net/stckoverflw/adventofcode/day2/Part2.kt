package net.stckoverflw.adventofcode.day2

fun main() {
    val input = {}.javaClass.getResource("/input.txt")?.readText() ?: error("No input.txt in resources")

    var horizontal = 0
    var depth = 0
    var aim = 0

    input.split("(\\r\\n|\\r|\\n)".toRegex()).forEach {
        val (instructionName, value) = it.split(' ')
        when (instructionName.lowercase()) {
            "forward" -> {
                horizontal += value.toInt()
                depth += (aim * value.toInt())
            }
            "up" -> {
                aim -= value.toInt()
            }
            "down" -> {
                aim += value.toInt()
            }
        }
    }

    println("Solution: " + (horizontal * depth))
}