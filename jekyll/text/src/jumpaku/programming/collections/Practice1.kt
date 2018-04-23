package jumpaku.programming.collections

fun main(args: Array<String>) {
    val numbers = 1..20
    val strings = numbers.map({
        when {
            it % 15 == 0 -> "FizzBuzz"
            it % 5 == 0 -> "Buzz"
            it % 3 == 0 -> "Fizz"
            else -> it.toString()
        }
    })
    strings.forEach({ println(it) })
}