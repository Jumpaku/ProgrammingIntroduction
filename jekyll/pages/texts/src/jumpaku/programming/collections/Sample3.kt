package jumpaku.programming.collections

fun main(args: Array<String>) {
    val list = listOf(1, 0, 8, 9)
    val mapped = list.map({ it * 2 })
    mapped.forEach({ println(it) })
}