package jumpaku.programming.classes

// Personクラスの定義
class Person(name: String, height: Double, mass: Double) {// コンストラクタの引数

    // フィールド
    val name: String
    val height: Double
    val mass: Double
    val bmiHigh = 25.0
    val bmiLow = 18.5

    init {// コンストラクタの処理
        this.name = name
        this.height = height
        this.mass = mass
    }

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
    val mpcMan = Person("MPC-Man", 1.728, 51.7)
    println("変数名 : mpcMan")
    println("型 : ${mpcMan::class}")
    println("${mpcMan.name}'s BMI is normal: ${mpcMan.isNormalBmi()}")
}