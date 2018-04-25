package jumpaku.programming.functions

// 既存の関数や変数のインポート
import kotlin.math.cos
import kotlin.math.sin
import kotlin.math.tan
import kotlin.math.PI

fun main(args: Array<String>) {
    // インポートした変数を参照
    val theta = PI/4.0
    // インポートした関数の呼び出し
    val sinTheta = sin(theta)
    val cosTheta = cos(theta)
    val tanTheta = tan(theta)
    println("sinTheta = $sinTheta") // sinTheta = 0.7071067811865475
    println("cosTheta = $cosTheta") // cosTheta = 0.7071067811865476
    println("tanTheta = $tanTheta") // tanTheta = 0.9999999999999999
}