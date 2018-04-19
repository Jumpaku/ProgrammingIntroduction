package jumpaku.programming.collections

fun main(args: Array<String>) {
    // 1, 0, 8, 9, 2, 8, 3を要素とするリストを生成
    val list = listOf(1, 0, 8, 9, 2, 8, 3)
    list.forEach({ print("$it, ") })
    println(list)
}