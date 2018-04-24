package jumpaku.programming.loops

fun fizzbuzz(number: Int): String {
    return when {
        number%15 == 0 -> "FizzBuzz"
        number%5 == 0 -> "Buzz"
        number%3 == 0 -> "Fizz"
        else -> number.toString()
    }
}

fun main(args: Array<String>) {
    for (n in 1..20) {
        println("$n -> ${fizzbuzz(n)}")
    }
}