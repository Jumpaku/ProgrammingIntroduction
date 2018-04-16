package jumpaku.programming.classes

import kotlin.math.sqrt

class Point(val x: Double, val y: Double) {
    fun distance(p: Point): Double {
        return sqrt((x - p.x)*(x - p.x) + (y - p.y)*(y - p.y))
    }
}

fun main(args: Array<String>) {
    val a = Point(1.0, 1.0)
    val b = Point(4.0, 5.0)
    val d = a.distance(b)
    println("distance between a and b: $d")
}