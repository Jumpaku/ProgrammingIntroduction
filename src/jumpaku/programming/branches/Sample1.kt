package jumpaku.programming.branches

/**
 * 引数が負の数なら"負", 正の数なら"正", 0なら"零"を返す.
 * @param number 整数
 * @return 変換後の文字列
 */
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
    val a = -10
    val b = 0
    val c = 5
    println("$a -> ${signString(a)}")
    println("$b -> ${signString(b)}")
    println("$c -> ${signString(c)}")
}