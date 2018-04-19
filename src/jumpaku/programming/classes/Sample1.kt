package jumpaku.programming.classes

// Personクラスの定義
class Person(// コンストラクタの引数
        name: String,
        age: Int) {

    // フィールドの定義
    val name: String = name// フィールドの初期化
    val age: Int = age// フィールドの初期化

    // メソッドの定義
    fun introduce() {
        println("My name is $name. I am $age years old.")
    }
}

fun main(args: Array<String>) {
    val mpcMan = Person("MPC-Man", 24)// コンストラクタの呼び出し

    // フィールドの参照
    println("mpcMan.name = ${mpcMan.name}") // mpcMan.name = MPC-Man
    println("mpcMan.age = ${mpcMan.age}") // mpcMan.age = 24

    // メソッドの呼び出し
    mpcMan.introduce() // My name is MPC-Man. I am 24 years old.
}