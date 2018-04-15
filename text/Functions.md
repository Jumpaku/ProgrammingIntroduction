# 関数

関数とは処理を一つにまとめて名前を付けて再利用できるようにしたものです．
関数は0個以上の引数(ひきすう)を受け取り，1個の返り値を返します．
引数とは関数内の処理で必要な入力データのことです．
返り値とは関数内の処理の結果として生成される出力データのことです．

## サンプルプログラム 1
```kt
package jumpaku.programming.functions

// 2つの実数の平均を計算するaverage関数の定義
fun average(a: Double, b: Double): Double {// 仮引数としてa, bを受け取る
    // 返り値として計算結果を返す
    return (a + b)/2.0
}

fun main(args: Array<String>) {
    val x = 11.0
    val y = 22.0
    // average関数の呼び出し
    // 実引数としてx, yを渡す
    val avg = average(x, y)
    // println関数の呼び出し
    // 実引数として文字列を渡す
    println("average of $x and $y = $avg")
}
```
このプログラムの実行結果は以下のようになります．
```
average of 11.0 and 22.0 = 16.5
```

## 関数の定義

関数を使用するには以下のように関数を定義します．
```kt
fun 関数名(引数1の名前: 引数1の型, ・・・): 返り値の型 {
    処理
    return 返り値
}
```
関数名は変数名と同じルールで命名します．

関数定義に書く引数を仮引数と呼びます．
引数の型は省略できません．
引数が0個の場合は以下のように書きます．
```kt
fun 関数名(): 返り値の型 {
    処理
    return 返り値
}
```

`return` は後の値が返り値として返します．
返り値から返り値の型が推論できる場合は返り値の型を省略できます．

また，`main` 関数のように返り値を返す必要がないときは `return Unit` とします．
このとき `Unit` を省略して単に `return` と書くことができます．
さらに，`return` を省略して以下のように書くことができます．
```kt
fun 関数名(引数1の名前: 引数1の型, ・・・) {
    処理
}
```

## 関数の呼び出し

関数の呼び出しとは定義されている関数を使用することです．
関数を呼び出すときは以下のように書きます．
```kt
関数名(引数, ・・・)
```
関数を呼び出すときに渡す引数を実引数と呼びます．
実引数の個数，型，順番は関数定義と一致させます．
実引数にはリテラル，変数，別の関数の返り値などの値を書きます．

関数呼び出しは返り値を表しているため，変数の初期値として使用できます．

## サンプルプログラム 2
```kt
package jumpaku.programming.functions

// kotlin.mathパッケージのsqrt関数をインポート
import kotlin.math.sqrt

// 平面上の2点間の距離を計算するdistance関数の定義
fun distance(x0: Double, y0: Double, x1: Double, y1: Double): Double {
    // 仮引数としてx0, y0, x1, y1を受け取る

    // 平方根を計算するsqrt関数の呼び出し
    // 計算結果を返り値として返す
    return sqrt((x0 - x1)*(x0 - x1) + (y0 - y1)*(y0 - y1))
}

fun main(args: Array<String>) {
    val aX = 1.0
    val aY = 1.0
    val bX = 4.0
    val bY = 5.0
    // distance関数の呼び出し
    // 実引数としてaX, aY, bX, bYを返す
    val distanceAB = distance(aX, aY, bX, bY)
    println("distance between ($aX, $aY) and ($bX, $bY) = $distanceAB")
}
```
このプログラムの実行結果は以下のようになります．
```
distance between (1.0, 1.0) and (4.0, 5.0) = 5.0
```

## インポート

既存のライブラリ内に使用したい関数が存在する場合，
自分で関数を定義する必要がありません．
既存の関数を使用するにはパッケージ宣言の下に以下のインポート命令を書きます．
```kt
import 関数が所属するパッケージ名.関数名
```


Kotlinの標準ライブラリ内に存在する関数の中にはインポート命令を省略できるものがあります．
例えば，`println` 関数は `kotlin.io` パッケージに所属しますがインポート命令を省略できます．

## 練習 1
1. 下のソースコード内の変数 `name`, `mass`, `height`, `bmi` の型を答えてください．
1. 下のソースコード内の関数 `computeBmi` について，仮引数のそれぞれの型と返り値の型を答えてください．
1. 下のソースコードの実行結果を予想してください．
1. 下のソースコードに，BMIの値が標準的かどうか( `true` か `false` )を判断する関数 `fun isNormal(bmi: Double): Boolean` を追加し，判断結果を出力するプログラムを作成してください．
```kt
package jumpaku.programming.functions

fun computeBmi(mass: Double, height: Double): Double {
    return mass/(height*height)
}

fun main(args: Array<String>) {
    val name = "MPC-Man"
    val mass = 51.7 //kg
    val height = 1.728 //m
    val bmi = computeBmi(mass, height)
    println("name: $name, mass: $mass, height: $height, BMI: $bmi")
}
```
## 練習 2
以下のソースコードに平面上の2つのベクトルのなす角(単位は度)を求める関数 `angleVectors(x0: Double, y0: Double, x1: Double, y1: Double): Double` の定義を追加してください．
平方根を求める関数や逆三角関数などが必要な場合は [Kotlin標準ライブラリのリファレンス](https://kotlinlang.org/api/latest/jvm/stdlib/index.html) の中から探してください．
```kt
package jumpaku.programming.variablesandoperators

import kotlin.math.PI
import kotlin.math.acos
import kotlin.math.sqrt

fun main(args: Array<String>) {
    val vX = 2.0
    val vY = 0.0
    val uX = 5.0
    val uY = 5.0
    val angle = angleVectors(vX, vY, uX, uY)
    println("angle between ($vX, $vY) and ($uX, $uY) = $angle [degree]")
}
```
