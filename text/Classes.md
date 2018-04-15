# クラス

クラスを定義することで新たな型を作成することができます．
クラスは複数のフィールドとメソッドをまとめた型です．
フィールドはクラスが持つデータを表し，メンバ変数と呼ばれることもあります．
メソッドはクラスが持つ処理を表し，メンバ関数と呼ばれることもあります．
クラスはコンストラクタという特別な初期化関数を持ちます．



## サンプルプログラム 1
```kt
package jumpaku.programming.classes

// Personクラスの定義
class Person(//コンストラクタの引数
        name: String,
        height: Double,
        mass: Double) {
    // フィールド
    val name: String
    val height: Double
    val mass: Double

    init {// コンストラクタの処理
        this.name = name
        this.height = height
        this.mass = mass
    }

    // メソッド
    fun computeBmi(): Double {
        return mass/(height*height)
    }
}

fun main(args: Array<String>) {
    val mpcMan = Person("MPC-Man", 1.728, 51.7)
    println("name: ${mpcMan.name}, height: ${mpcMan.height}, mass: ${mpcMan.mass}")
    println("BMI: ${mpcMan.computeBmi()}")
}
```
## メンバ変数

## メンバ関数

## コンストラクタ

## クラスの利用

## データクラス

## 列挙クラス

## 練習

