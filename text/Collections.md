# コレクション

コレクションは複数の同じ型のデータを集めたものの集合を表す型です．
コレクションが持つデータは全て同じ型を持ちます．
ここではコレクションの一つであるリストについて説明します．
コレクションはLambda式と一緒に使用されます．
Lambda式は関数を簡単に記述するものです．

## サンプルプログラム 1
```kt
package jumpaku.programming.collections

fun main(args: Array<String>) {
    // 1, 0, 8, 9, 2, 8, 3を要素とするリストを生成
    val list: List<Int> = listOf(1, 0, 8, 9, 2, 8, 3)
    list.forEach({ print("$it, ") })
}
```

## リスト
リストはコレクションの一つで複数のデータを並べた列を表す型です．
リストは `List<要素の型>` という型を持ちます．
例えば要素の型が `Int` である場合は `List<Int>` となります．
リストを生成するには以下のように `listOf` 関数を呼び出します．
```kt
listOf(要素, ・・・)
```


## コレクションの基本操作

### 生成

### 加工(map)

### フィルタ(filter)

### 集約(fold)

### 使用(forEach)

## その他

### zip

### windowed

## 練習

## 補足

### サンプルプログラム 1
```kt
package jumpaku.programming.collections

// average関数の定義
fun average(a: Double, b: Double): Double {
    return (a + b)/2
}
fun main(args: Array<String>) {
    // 関数で変数を初期化
    val averageFun: (Double, Double)->Double = ::average
    // Lambda式で変数を初期化
    val averageLambda: (Double, Double)->Double = { a: Double, b: Double -> (a + b)/2 }
    println("averageFun(5.0, 6.0) = ${averageFun(5.0, 6.0)}")
    println("averageLambda(5.0, 6.0) = ${averageLambda(5.0, 6.0)}")
}
```
```
averageFun(5.0, 6.0) = 5.5
averageLambda(5.0, 6.0) = 5.5
```

### 関数の値

関数を初期値として変数を定義することができます．
関数は `(引数の型, ・・・)->返り値の型` という型を持ちます．
関数の値を参照するには `パッケージ名::関数名` と書きます．
同一パッケージ内の関数の値を参照するには `::関数名` と書くことができます．
変数に格納された関数を呼び出すには `変数名(引数, ・・・)` と書きます．

### Lambda式

Lambda式は関数を簡単に記述するものです．
引数の無いLambda式は以下のように書きます．
```kt
{ 返り値 }
```
以下はその例です．
```kt
{ "Hello" }
```
引数のあるLambda式は以下のように書きます．
```kt
{ 引数名: 引数の型, ・・・ -> 返り値 }
```
以下はその例です．
```kt
{ a: Double, b: Double -> (a + b)/2 }
```
Lambda式は引数の型を推論できる場合，引数の型を省略することができます．
以下はその例です．
```kt
val averageLambda: (Double, Double)->Double = { a, b -> (a + b)/2 }
```
引数が1つで型を推論できるLambda式は以下のように引数を省略し，`it` を引数として使用することができます．
以下はその例です．
```kt
val add1: (Int)->Int = { it + 1 }
```