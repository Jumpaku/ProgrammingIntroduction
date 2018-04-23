package jumpaku.programming.collections

fun main(args: Array<String>) {
    val list = listOf(1, 0, 8, 9)
    val folded = list.fold(0, { sum, x -> sum + x })
    println("folded = $folded")
}