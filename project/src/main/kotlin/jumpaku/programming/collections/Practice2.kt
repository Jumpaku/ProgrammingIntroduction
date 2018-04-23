package jumpaku.programming.collections

fun main(args: Array<String>) {
    val result = listOf(0, 1, 5, -3, 7, -4, 2, 8, 8, 3, -4, 0)
            .filter({ it > 0 })
            .fold(1, { product, x -> product*x })
    println("result = $result")
}