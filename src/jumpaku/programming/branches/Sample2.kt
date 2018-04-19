package jumpaku.programming.branches

// 引数が負の数なら"負", 正の数なら"正", 0なら"零"を返す.
fun signStringWhen(number: Int): String {
    // 条件によって異なる値で変数を初期化
    val string = when {
        number < 0 -> "負"// 負の数の場合
        number > 0 -> "正"// 正の数の場合
        else -> "零"// それ以外の場合
    }
    return string
}

fun main(args: Array<String>) {
    val a = signStringWhen(-10)
    val b = signStringWhen(0)
    val c = signStringWhen(5)
    println("-10 -> $a")
    println("0 -> $b")
    println("5 -> $c")
}