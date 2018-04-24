package jumpaku.programming.collections

fun main(args: Array<String>) {
    val list = listOf(1, 0, 8, 9)
    val filtered = list.filter({ it % 2 == 0 })
    filtered.forEach({ println(it) })
}