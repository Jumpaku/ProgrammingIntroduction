package jumpaku.programming.collections

fun main(args: Array<String>) {
    val numbers = 1..20
    val strings = numbers.map({
        /* Lambda式 */
    })
    strings.forEach({ println(it) })
}