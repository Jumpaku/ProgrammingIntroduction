package jumpaku.programming.variablesandoperators

import kotlin.math.PI
import kotlin.math.acos
import kotlin.math.sqrt

fun angleVectors(x0: Double, y0: Double, x1: Double, y1: Double): Double {
    val dot = x0*x1 + y0*y1
    val abs = sqrt((x0*x0 + y0*y0) * (x1*x1 + y1*y1))
    return acos(dot/abs)*180/PI
}

fun main(args: Array<String>) {
    val vX = 2.0
    val vY = 0.0
    val uX = 5.0
    val uY = 5.0
    val angle = angleVectors(vX, vY, uX, uY)
    println("angle between ($vX, $vY) and ($uX, $uY) = $angle [degree]")
}