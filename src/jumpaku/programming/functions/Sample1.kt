package jumpaku.programming.functions

// 2つの実数の平均を計算するaverage関数の定義
fun average(a: Double, b: Double): Double {// 仮引数としてa, bを受け取る
    // 返り値として計算結果を返す
    return (a + b)/2.0
}

fun main(args: Array<String>) {
    val x = 11.0
    val y = 22.0
    // average関数の呼び出し
    // 実引数としてx, yを渡す
    // 返り値を変数の初期値として使用
    val avg = average(x, y)
    // println関数の呼び出し
    // 実引数として文字列を渡す
    println("average of $x and $y = $avg")
}