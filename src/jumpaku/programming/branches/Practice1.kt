package jumpaku.programming.branches

/**
 * 点数に応じたGPを返します．
 * @param score 点数
 * @return GP
 */
fun gradePoint(score: Int): Int {
    return when {
        score < 60 -> 0
        score < 70 -> 1
        score < 80 -> 2
        score < 90 -> 3
        else -> 4
    }
}

fun main(args: Array<String>) {
    val math = 100
    val programming = 90
    val english = 89
    val economics = 59
    val chinese = 60
    println("math: $math -> ${gradePoint(math)}")
    println("programming: $programming -> ${gradePoint(programming)}")
    println("english: $english -> ${gradePoint(english)}")
    println("economics: $economics -> ${gradePoint(economics)}")
    println("chinese: $chinese -> ${gradePoint(chinese)}")
}

