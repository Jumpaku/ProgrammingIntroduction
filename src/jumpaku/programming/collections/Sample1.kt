package jumpaku.programming.collections

// average関数の定義
fun average(a: Double, b: Double): Double {
    return (a + b)/2
}
fun main(args: Array<String>) {
    // 関数で変数を初期化
    val averageFun: (Double, Double)->Double = ::average
    // Lambda式で変数を初期化
    val averageLambda: (Double, Double)->Double = { a: Double, b: Double -> (a + b)/2 }
    println("averageFun(5.0, 6.0) = ${averageFun(5.0, 6.0)}")
    println("averageLambda(5.0, 6.0) = ${averageLambda(5.0, 6.0)}")
}