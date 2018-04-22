# クラス

ここではクラスについて解説します．
いままで利用していたデータクラスは，ここで説明するクラスの一例です．

クラスは複数のフィールドとメソッドをまとめた型です．
フィールドはクラスが持つデータを表し，メンバ変数と呼ばれることもあります．
メソッドはクラスが持つ処理を表し，メンバ関数と呼ばれることもあります．
クラスはコンストラクタという特別なインスタンス生成関数を持ちます．

以下は `Person` クラスを利用するプログラムです．
```kt
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
```
以下はこのプログラムの実行結果です．
```
mpcMan.name = MPC-Man
mpcMan.age = 24
My name is MPC-Man. I am 24 years old.
```

## クラスの定義
以下はクラス定義の構文です．
```kt
class クラス名(コンストラクタの引数,・・・) {
    フィールドやメソッドなど
}
```
フィールドは変数と同じように書き，コンストラクタの引数で初期化することができます．

メソッドは関数と同じように書きます．
メソッドの処理では引数の他にフィールドを参照することができます．

コンストラクタは `クラス名` の後に書かれた引数を受け取り，インスタンスを生成して返す関数です．
コンストラクタの関数名と返り値の型は `クラス名` と同じになります．

## インスタンス生成
以下はインスタンスを生成し，変数を初期化する構文です．
```kt
// コンストラクタを呼び出してインスタンスを生成
// 生成したインスタンスを初期値として変数を定義
val 変数 = クラス名(引数, ・・・)
```
以下のように `.` を用いることでインスタンスが持つフィールドの値を参照したり，メソッドを呼び出したりすることができます．
```kt
// フィールドを参照
変数.フィールド名

// メソッドを呼び出す
変数.メソッド名(引数, ・・・)
```

サンプルプログラム1の `Person` クラスの定義は以下のように省略できます．
```kt
// Personクラスの定義
class Person(// コンストラクタの引数で直接フィールドを初期化
        val name: String,
        val age: Int) {

    // メソッドの定義
    fun introduce() {
        println("My name is $name. I am $age years old.")
    }
}
```

## 練習 1
1. 下のソースコード内の変数 `a`, `b`, `c`, `t`, `area` の型を答えてください．
1. 下のソースコードの実行結果を予想してください．
```kt
package jumpaku.programming.classes

import kotlin.math.PI
import kotlin.math.sqrt

// 平面上の点を表すデータクラス
data class Point(val x: Double, val y: Double)

// 2点間の距離を計算する関数
fun distance(p: Point, q: Point): Double {
    return sqrt((p.x - q.x)*(p.x - q.x) + (p.y - q.y)*(p.y - q.y))
}

// 平面上の円を表すクラス
class Circle(val center: Point, val radius: Double) {
    fun includes(p: Point): Boolean {
        return distance(center, p) <= radius
    }
    fun area(): Double {
        return radius*radius*PI
    }
}

fun main(args: Array<String>) {
    val o = Circle(Point(1.0, 1.0), 2.0)
    val a = Point(0.0, 2.0)
    val includes = o.includes(a)
    val area = o.area()
    println("o.includes(a) = $includes")
    println("o.area() = $area")
}
```

## 練習 2
1. 3次元ベクトルを表す `Vector` クラスを定義してください．
`Vector` クラスはフィールドとして `x`, `y`, `z` を持ちます．
また，メソッドとして，
`a` を実数として `a` 倍したベクトルを返す `multiply(a: Double): Vector`, 
`v` をベクトルとして `v` を加えたベクトルを返す `add(v: Vector): Vector`
を持ちます．
1. s = 3.2, v0 = (1.0, 2.0, 3.0), v1 = (-3.0, -1.0, 1.0) とします．
上で定義したクラスを用いて，s*v0, v0 + v1を計算するプログラムを作成してください．
