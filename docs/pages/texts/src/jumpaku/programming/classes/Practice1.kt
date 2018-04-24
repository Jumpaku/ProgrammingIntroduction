package jumpaku.programming.classes

import kotlin.math.sqrt

// 平面上の点を表すクラス
data class Point(val x: Double, val y: Double)

// 2点間の距離を計算する関数
fun distance(p: Point, q: Point): Double {
    return sqrt((p.x - q.x)*(p.x - q.x) + (p.y - q.y)*(p.y - q.y))
}

// 平面上の三角形を表すクラス
class Triangle(val a: Point, val b: Point, val c: Point) {
    fun area(): Double {
        val ab = distance(a, b)
        val bc = distance(b, c)
        val ca = distance(c, a)
        val s = (ab + bc + ca)/2.0
        return sqrt(s*(s - ab)*(s - bc)*(s - ca))
    }
}

fun main(args: Array<String>) {
    val a = Point(1.0, 1.0)
    val b = Point(4.0, 5.0)
    val c = Point(4.0, 1.0)
    val t = Triangle(a, b, c)
    val area = t.area()
    println("t.area() = $area")
}