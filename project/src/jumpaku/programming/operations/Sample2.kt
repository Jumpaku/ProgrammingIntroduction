package jumpaku.programming.operations

fun main(args: Array<String>) {
    val s0 = "abc"
    val s1 = "xyz"
    val concatenated = s0 + s1
    val containsCx = "cx" in concatenated

    println("concatenated = $concatenated") // "abcxyz"
    println("containsCx = $containsCx") // true
}