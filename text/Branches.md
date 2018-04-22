# 分岐

分岐とは条件によって異なる計算や処理をすることです．

## `if` `else` による分岐
以下は条件によって異なる値を出力するプログラムです．
```kt
```
以下はこのプログラムの実行結果です．
```
```
`if` `else` 式は条件によって異なる値をとります．
以下は `if` `else` による分岐の構文です．
```kt
if (条件) {
    条件を満たす場合の値，処理
}
else {
    条件を満たさない場合の値，処理
}
```
`条件` には `Boolean` 型の値を書きます．

以下のように `else` の後に `if` `else` 式を繰り返すことで複数の条件で分岐することもできます．
```kt
if (条件1) {
    条件1を満たす場合の値，処理
}
else if (条件2) {
    条件2を満たす場合の値，処理
}
else {
    どの条件も満たさない場合の値，処理
}
```

## `when` による分岐
`if` `else` の他に `when` を使うこともできます．
以下は上のプログラムを `when` を使って書き直したものです．
```kt
```
以下はこのプログラムの実行結果です．
```
```
以下は `when` を用いた分岐の構文です．
```kt
when {
    条件 -> 条件を満たす場合の値，処理
    else -> 条件を満たさない場合の値，処理
}
```
`when` 式の `条件` にも `Boolean` 型の値を書きます．
また，以下のように条件を増やすこともできます．
```kt
when {
    条件1 -> 条件1を満たす場合の値，処理
    条件2 -> 条件2を満たす場合の値，処理
    else -> どの条件も満たさない場合の値，処理
}
```

`if` `else` 式と `when` 式は同じことができますが，ソースコードがシンプルで読みやすい方を選びます．

## 練習

1. 下のソースコード内の変数 `string` の型を答えてください．
1. 下のソースコードの実行結果を予想してください．
1. 下のソースコードの `if` `else` を `when` 書き換えてください．
```kt
package jumpaku.programming.branches

// 引数が15の倍数なら"FizzBuzz", 5の倍数なら"Buzz", 3の倍数なら"Fizz", それ以外ならその数字を返す
fun fizzbuzz(number: Int): String {
    val string = if (number%15 == 0) {
        "FizzBuzz"
    }
    else if (number%5 == 0){
        "Buzz"
    }
    else if (number%3 == 0){
        "Fizz"
    }
    else {
        number.toString()
    }
    return string// 返り値
}

fun main(args: Array<String>) {
    val a = fizzbuzz(10)
    val b = fizzbuzz(8)
    val c = fizzbuzz(9)
    val d = fizzbuzz(90)
    println("10 -> $a")
    println("8 -> $b")
    println("9 -> $c")
    println("90 -> $d")
}
```
