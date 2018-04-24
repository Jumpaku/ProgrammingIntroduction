package jumpaku.programming.branches

// 引数が負の数なら"負", 正の数なら"正", 0なら"零"を返す.
fun signString(number: Int): String {
    // 条件によって異なる値で変数を初期化
    val string = if (number < 0) {// 負の数の場合
        "負"
    } else if(number > 0) {// 正の数の場合
        "正"
    } else {// それ以外の場合
        "零"
    }
    return string
}

fun main(args: Array<String>) {
    val a = signString(-10)
    val b = signString(0)
    val c = signString(5)
    println("-10 -> $a")
    println("0 -> $b")
    println("5 -> $c")
}