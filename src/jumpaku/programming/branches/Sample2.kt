package jumpaku.programming.branches

/**
 * Int型の数値を文字列に変換する.
 * ただし, 引数が3の倍数か3の付く数字なら文字列の末尾に"!"を付加する.
 * @param number 整数
 * @return 変換後の文字列
  */
fun nabeatsu(number: Int): String {
    // IntクラスのtoStringメソッドを呼び出し，数値を文字列に変換
    val numberString = number.toString()
    // 条件によって異なる値で変数を初期化
    val end = when {
        // 3の倍数なら末尾に付加する文字を"!"にする
        number%3 == 0 -> "!"
        // 3の倍数なら末尾に付加する文字を"!"にする
        // Stringクラスのcontainsメソッドを呼び出し，
        // numberStringが"3"を含むかどうかを調べる
        numberString.contains("3") -> "!"
        // どの条件も満たさないなら末尾に付加する文字を空にする
        else -> ""
    }
    return numberString + end
}

fun main(args: Array<String>) {
    val a = 11
    val b = 12
    val c = 13
    println("$a -> ${nabeatsu(a)}")
    println("$b -> ${nabeatsu(b)}")
    println("$c -> ${nabeatsu(c)}")
}