package jumpaku.programming.variablesandoperators

fun main(args: Array<String>) {
    val x = 87
    val y = 7
    println("数値演算")
    println("x + y = ${x + y}") // 和
    println("x - y = ${x - y}") // 差
    println("x * y = ${x * y}") // 積
    println("x / y = ${x / y}") // 商
    println("x % y = ${x % y}") // 剰余

    println("比較演算")
    println("x == y = ${x == y}") // イコール
    println("x != y = ${x != y}") // ノットイコール
    println("x < y = ${x < y}") // 小なり
    println("x <= y = ${x <= y}") // 小なりイコール
    println("x > y = ${x > y}") // 大なり
    println("x >= y = ${x >= y}") // 大なりイコール

    val t = true
    val f = false
    println("真理値演算")
    println("t && f = ${t && f}") // かつ
    println("t || f = ${t || f}") // または
    println("!t = ${!t}") // 否定
    println("!f = ${!f}") // 否定
}
