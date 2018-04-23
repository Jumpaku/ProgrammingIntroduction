package jumpaku.programming.branches

// 引数が15の倍数なら"FizzBuzz", 5の倍数なら"Buzz", 3の倍数なら"Fizz", それ以外ならその数字を返す.
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
    val a = fizzbuzz(10)
    val b = fizzbuzz(8)
    val c = fizzbuzz(9)
    val d = fizzbuzz(90)
    println("10 -> $a")
    println("8 -> $b")
    println("9 -> $c")
    println("90 -> $d")
}