package jumpaku.programming.branches

/**
 * 引数が15の倍数なら"FizzBuzz", 5の倍数なら"Buzz", 3の倍数なら"Fizz", それ以外ならその数字を返す.
 * @param number 整数
 * @return 変換後の文字列
 */
fun fizzbuzz(number: Int): String {
    val string = if (number%15 == 0) {
        "FizzBuzz"
    }
    else if (number%5 == 0){
        "Buzz"
    }
    else if (number%3 == 0){
        "Fizz"
    }
    else {
        number.toString()
    }
    return string// 返り値
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