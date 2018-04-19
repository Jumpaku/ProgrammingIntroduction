package jumpaku.programming.functions

// average関数の定義(2つの実数の平均を計算する)
fun average(a: Double, b: Double): Double {
    return (a + b)/2.0
}

fun main(args: Array<String>) {
    val x = 11.0
    val y = 22.0
    val avg = average(x, y)
    println("average($x, $y) = $avg")// average(11.0, 22.0) = 16.5
}