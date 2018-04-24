package jumpaku.programming.variables

// 個人を表すPersonデータクラスの定義
data class Person(
        val name: String, // nameフィールド
        val age: Int) //ageフィールド

fun main(args: Array<String>) {
    val list = listOf(1, 0, 8, 9, 2, 8, 3) // List<Int>（列）
    val person = Person("Saga Ken", 25) // Person（個人）

    // リストインスタンスを参照
    println("list = $list") // list = 123.0
    // リストインスタンスのの3番目の要素を参照
    println("list[3] = ${list[3]}") // list[3] = 9
    // Personクラスインスタンスを参照
    println("person = $person") // person = Person(name=Saga Ken, age=25)
    // Personクラスインスタンスのnameフィールドを参照
    println("person.name = ${person.name}") // person.name = Saga
}