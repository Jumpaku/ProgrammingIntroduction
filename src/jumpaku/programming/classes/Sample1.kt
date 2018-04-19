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
    // Personクラスのコンストラクの呼び出し，インスタンスの生成
    val mpcMan = Person("MPC-Man", 24)
    println("mpcManの型 : ${mpcMan::class}")
    // フィールドの参照
    println("mpcMan.name = ${mpcMan.name}")
    println("mpcMan.age = ${mpcMan.age}")
    // メソッドの呼び出し
    mpcMan.introduce()
}