package jumpaku.programming.variablesandoperators

fun main(args: Array<String>) {

    // 変数定義
    val integer = 123
    val real = 123.0
    val character = 'X'
    val string = "abc"
    val truthValue = true

    // 変数の値の出力
    println("変数名 : integer, 型 : ${integer::class}, 値 : $integer")
    println("変数名 : real, 型 : ${real::class}, 値 : $real")
    println("変数名 : character, 型 : ${character::class}, 値 : $character")
    println("変数名 : string, 型 : ${string::class}, 値 : $string")
    println("変数名 : truthValue, 型 : ${truthValue::class}, 値 : $truthValue")
}