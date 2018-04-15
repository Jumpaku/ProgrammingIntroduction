package jumpaku.programming.functions

fun computeBmi(mass: Double, height: Double): Double {
    return mass/(height*height)
}

fun main(args: Array<String>) {
    val name = "MPC-Man"
    val mass = 51.7 //kg
    val height = 1.728 //m
    val bmi = computeBmi(mass, height)
    println("name: $name, mass: $mass, height: $height, BMI: $bmi")
}