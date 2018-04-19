# 関数

関数とは処理を一つにまとめて名前を付けて再利用できるようにしたものです．
関数は0個以上の引数(ひきすう)を受け取り，1個の返り値を返します．
引数とは関数内の処理で必要な入力データのことです．
返り値とは関数内の処理の結果として生成される出力データのことです．

関数が呼び出されると，処理が関数定義にジャンプし，関数内の処理が実行されます．
関数内の処理が終わると呼び出し元に処理が戻ります．

以下は関数の定義と呼び出しを行うプログラムです．
```kt
```
以下はその実行結果です．
```
```

## 関数の定義
以下は関数定義の構文です．
```kt
fun 関数名(仮引数名: 仮引数の型, ・・・): 返り値の型 {
    処理
    return 返り値
}
```
関数名に使える文字は変数名と同じです．

仮引数とは関数が受け取る引数のことです．
仮引数の型は省略できません．
引数が無い場合は以下のように書きます．
```kt
fun 関数名(): 返り値の型 {
    処理
    return 返り値
}
```
`return 返り値` は関数内の処理を終了し，返り値を返します．

`main` 関数のように返り値を返す必要がない場合は，
返り値を省略して単に `return` と書くことができます．
この場合，以下のように `return` を省略することもできます．
```kt
fun 関数名(引数1の名前: 引数1の型, ・・・) {
    処理
}
```

## 関数の呼び出し
以下は定義されている関数を呼び出す構文です．
```kt
関数名(実引数,・・・)
```
実引数とは関数を呼び出すときに渡す引数のことです．
実引数の個数，型，順番は関数定義と一致させます．
実引数にはリテラル，変数，別の関数の返り値などの値を書きます．

## 関数のインポート
以下はインポートした関数をプログラムです．
```kt
package jumpaku.programming.functions

// 既存の関数や変数のインポート
import kotlin.math.cos
import kotlin.math.sin
import kotlin.math.tan
import kotlin.math.PI

fun main(args: Array<String>) {
    // インポートした変数を参照
    val theta = PI/4.0
    // インポートした関数の呼び出し
    val sinTheta = sin(theta)
    val cosTheta = cos(theta)
    val tanTheta = tan(theta)
    println("sinTheta = $sinTheta") // sinTheta = 0.7071067811865475
    println("cosTheta = $cosTheta") // cosTheta = 0.7071067811865476
    println("tanTheta = $tanTheta") // tanTheta = 0.9999999999999999
}
```
以下はその実行結果です．
```
```

インポートとは既存の関数等を使用することを宣言することです．
以下はインポート命令の構文です．
```kt
import 関数が所属するパッケージ名.関数名
```
インポート命令を記述するときはパッケージ宣言の下に記述します．

Kotlinの標準ライブラリ内に存在する関数の中にはインポート命令を省略できるものがあります．
例えば，`println` 関数は `kotlin.io` パッケージに所属しますがインポート命令を省略できます．

## 練習 1
1. 下のソースコード内の変数 `a`, `b`, `d` の型を答えてください．
1. 下のソースコード内の関数 `distance` の引数の型と返り値の型を答えてください．
1. 下のソースコードの実行結果を予想してください．
1. 下のソースコードに平面上の2点 `p`, `q` を `t : (1.0 - t)` に内分する点を計算する関数 `divide(p: Point, q: Point, t: Double): Point` を追加し，点`(-2.0, 3.0)`, `(8.0, 13.0)` を `0.7 : 0.3` に内分する点を計算して出力するプログラムを作成してください．
```kt
package jumpaku.programming.functions

import kotlin.math.sqrt

// 平面上の点を表すデータクラス
data class Point(val x: Double, val y: Double)

// 平面上の2点間の距離を計算する関数
fun distance(p: Point, q: Point): Double {
    return sqrt((p.x - q.x)*(p.x - q.x) + (p.y - q.y)*(p.y - q.y))
}

fun main(args: Array<String>) {
    val a = Point(1.0, 1.0)
    val b = Point(4.0, 5.0)
    val d = distance(a, b)
    println("distance($a, $b) = $d")
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
