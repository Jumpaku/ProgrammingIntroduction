package jumpaku.programming.classes

// Personクラスの定義
class Person2(// コンストラクタの引数で直接フィールドを初期化
        val name: String,
        val age: Int) {

    // メソッドの定義
    fun introduce() {
        println("My name is $name. I am $age years old.")
    }
}