package jumpaku.programming.branches

/**
 * 引数が15の倍数なら"FizBuzz", 5の倍数なら"Buzz", 3の倍数なら"Fizz", それ以外ならその数字を返す.
 * @param number 整数
 * @return 変換後の文字列
 */
fun fizzbuzz(number: Int): String {
    // 条件によって異なる値で変数を初期化
    val string = if (number%15 == 0) {// 15の倍数である条件
        "FizzBuzz"// 15の倍数である時の値
    } else if (number%5 == 0) {// 5の倍数である条件
        "Buzz"// 5の倍数である時の値
    } else if (number%3 == 0) {// 3の倍数である条件
        "Fizz"// 3の倍数である時の値
    } else {// 上のどれでもない条件
        // IntクラスのtoStringメソッドを呼び出し，数値を文字列に変換
        number.toString()// 上のどれでもない時の値
    }
    // 変数を返す
    return string
}

fun main(args: Array<String>) {
    val a = 10
    val b = 8
    val c = 9
    val d = 90
    println("$a -> ${fizzbuzz(a)}")
    println("$b -> ${fizzbuzz(b)}")
    println("$c -> ${fizzbuzz(c)}")
    println("$d -> ${fizzbuzz(d)}")

}