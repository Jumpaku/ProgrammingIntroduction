package jumpaku.programming.collections

fun main(args: Array<String>) {
    // Lambda式で変数を初期化
    val averageLambda = { a: Double, b: Double -> (a + b)/2.0 }
    // Lambda式の呼び出し
    val result = averageLambda(5.0, 6.0)
    println("averageLambda(5.0, 6.0) = $result")
}