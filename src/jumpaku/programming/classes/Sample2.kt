package jumpaku.programming.classes

// Personクラスの定義
class Person2(// コンストラクタの引数で直接フィールドを初期化
        val name: String,
        val height: Double,
        val mass: Double) {

    // フィールド
    val bmiHigh = 25.0
    val bmiLow = 18.5

    // メソッド
    fun computeBmi(): Double {
        return mass/(height*height)
    }
    fun isNormalBmi(): Boolean {
        val bmi = computeBmi()
        return bmiLow <= bmi && bmi <= bmiHigh
    }
}

fun main(args: Array<String>) {
    // Personクラスのコンストラクの呼び出し，インスタンスの生成
    val mpcMan = Person2("MPC-Man", 1.728, 51.7)
    println("変数名 : mpcMan")
    println("型 : ${mpcMan::class}")
    // フィールドの参照とメソッドの呼び出し
    println("${mpcMan.name}'s BMI is normal: ${mpcMan.isNormalBmi()}")
}