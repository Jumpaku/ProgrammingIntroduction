package jumpaku.programming.classes

import kotlin.math.sqrt

class Triangle(val a: Point, val b: Point, val c: Point) {
    fun area(): Double {
        val ab = a.distance(b)
        val bc = b.distance(c)
        val ca = c.distance(a)
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
    println("triangle area: $area")
}