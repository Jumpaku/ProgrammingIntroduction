package jumpaku.programming.functions

// kotlin.mathパッケージのsqrt関数をインポート
import kotlin.math.sqrt

// 平面上の2点間の距離を計算するdistance関数の定義
fun distance(x0: Double, y0: Double, x1: Double, y1: Double): Double {
    // 仮引数としてx0, y0, x1, y1を受け取る

    // 平方根を計算するsqrt関数の呼び出し
    // 計算結果を返り値として返す
    return sqrt((x0 - x1)*(x0 - x1) + (y0 - y1)*(y0 - y1))
}

fun main(args: Array<String>) {
    val aX = 1.0
    val aY = 1.0
    val bX = 4.0
    val bY = 5.0
    // distance関数の呼び出し
    // 実引数としてaX, aY, bX, bYを返す
    val distanceAB = distance(aX, aY, bX, bY)
    println("distance between ($aX, $aY) and ($bX, $bY) = $distanceAB")
}