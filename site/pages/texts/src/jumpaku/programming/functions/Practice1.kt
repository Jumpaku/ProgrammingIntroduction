package jumpaku.programming.functions

import kotlin.math.sqrt

// 平面上の点を表すデータクラス
data class Point(val x: Double, val y: Double)

// 平面上の2点p, q間の距離を計算する関数
fun distance(p: Point, q: Point): Double {
    return sqrt((p.x - q.x)*(p.x - q.x) + (p.y - q.y)*(p.y - q.y))
}

// 平面上の2点p, qをt : (1.0 - t)に内分する点を計算する関数
fun divide(p: Point, q: Point, t: Double): Point {
    return Point((1 - t)*p.x + t*q.x, (1 - t)*p.y + t*q.y)
}

fun main(args: Array<String>) {
    val a = Point(1.0, 1.0)
    val b = Point(4.0, 5.0)
    val d = distance(a, b)
    println("distance($a, $b) = $d")

    val p = Point(-2.0, 3.0)
    val q = Point(8.0, 13.0)
    val t = 0.7
    val r = divide(p, q, t)
    println("divide($p, $q $t) = $r")

}