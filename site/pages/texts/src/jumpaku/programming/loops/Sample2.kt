package jumpaku.programming.loops

fun main(args: Array<String>) {
    do {// コンソールへの標準入力を繰り返す
        println("input in console")
        // 標準入力の文字列を返すreadLine関数の呼び出し
        val input = readLine()
    } while (input != "OK")// 繰り返しを続ける条件，"OK"が入力されるまで繰り返す

    println("done")
}