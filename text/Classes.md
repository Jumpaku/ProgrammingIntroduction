# クラス

クラスを定義することで新たな型を作成することができます．
クラスは複数のフィールドとメソッドをまとめた型です．
フィールドはクラスが持つデータを表し，メンバ変数と呼ばれることもあります．
メソッドはクラスが持つ処理を表し，メンバ関数と呼ばれることもあります．

定義したクラスはインスタンスを生成することで利用できます．
インスタンスはメモリ上の領域に格納されたデータでクラスを実体化したものです．
クラスはコンストラクタという特別な初期化関数を持ちます．
コンストラクタはインスタンスを生成する関数で，メモリ領域を確保し，フィールドを初期化して，クラスを実体化します．

## サンプルプログラム 1
```kt
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
```
このプログラムの実行結果は以下のようになります．
```
変数名 : mpcMan
型 : class jumpaku.programming.classes.Person
MPC-Man's BMI is normal: false
```


## クラスの定義

クラスを利用するには以下のようにクラスを定義します．
```kt
class クラス名(コンストラクタの引数,・・・) {
    メンバ
}
```
`メンバ` にはフィールド，メソッド，コンストラクタの処理などを書きます．
フィールドは変数と同じように書きます．
メソッドは関数と同じように書きます．
コンストラクタの処理は以下のように書きます．
```kt
init{
    コンストラクタの処理
}
```
コンストラクタは `クラス名` の後に書かれた引数を受け取り，インスタンスと返します．
コンストラクタの関数名と返り値の型は `クラス名` と同時になります．

## クラスの実体化

定義したクラスを利用するにはインスタンスを生成します．
インスタンスを生成するには以下のようにコンストラクタを呼び出します．
```kt
// コンストラクタを呼び出してインスタンスを生成
// 生成したインスタンスを初期値として変数を定義
val 変数 = クラス名(引数, ・・・)
```
以下のように `.` を用いることでフィールドの値を参照したり，メソッドを呼び出したりすることができます．
```kt
// フィールドを参照
変数.フィールド名

// メソッドを呼び出す
変数.メソッド名(引数, ・・・)
```

クラスの内部からインスタンス自身のフィールドを参照したり，メソッドを呼び出したりするには `this.フィールド名`, `this.メソッド名(引数, ・・・)` と書きます．
`this` はクラスの内部でインスタンス自身を表すもので，紛らわしくない場合は省略できます．

## サンプルプログラム 2
```kt
package jumpaku.programming.classes

// Personクラスの定義
class Person(// コンストラクタの引数で直接フィールドを初期化
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
    val mpcMan = Person("MPC-Man", 1.728, 51.7)
    println("変数名 : mpcMan")
    println("型 : ${mpcMan::class}")
    // フィールドの参照とメソッドの呼び出し
    println("${mpcMan.name}'s BMI is normal: ${mpcMan.isNormalBmi()}")
}
```
このプログラムの実行結果は上のプログラムと同じです．

## クラス定義の省略

サンプルプログラム1のクラス定義はサンプルプログラム2のように省略することができます．
サンプルプログラム2ではコンストラクタが受け取った引数が直接フィールドの初期値となります．

Kotlinでは以下の3つは同じクラスを表し，互いに書き換えることができます．
```kt
class Sample(name: String) {
    val name: String
    init {
        this.name = name
    }
}
```
```kt
class Sample(name: String) {
    val name: String = name
}
```
```kt
class Sample(val name: String) {
}
```

## 練習
1. 下のソースコード内の変数 `a`, `b`, `d` の型を答えてください．
1. 下のソースコードの実行結果を予想してください．
1. 下のソースコードの `Point` クラスを利用して，平面上の三角形を表す `Triangle` クラスを定義してください．
`Triangle` クラスは3つの `Point` 型のフィールド `a`, `b`, `c` と面積を計算する `area(): Double` メソッドを持ちます．
1. `Triangle` クラスを利用して点(1, 1), (4, 5), (4, 1)を頂点とする三角形の面積を計算し，計算結果を出力するプログラムを作成してください．

```kt
package jumpaku.programming.classes

import kotlin.math.sqrt

class Point(val x: Double, val y: Double) {
    fun distance(p: Point): Double {
        return sqrt((x - p.x)*(x - p.x) + (y - p.y)*(y - p.y))
    }
}

fun main(args: Array<String>) {
    val a = Point(1.0, 1.0)
    val b = Point(4.0, 5.0)
    val d = a.distance(b)
    println("distance between a and b: $d")
}
```

