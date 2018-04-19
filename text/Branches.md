# 分岐

分岐とは条件によって異なる値になったり，処理をしたりすることです．

## サンプルプログラム 1
```kt
package jumpaku.programming.branches

/**
 * 引数が負の数なら"負", 正の数なら"正", 0なら"零"を返す.
 * @param number 整数
 * @return 変換後の文字列
 */
fun signString(number: Int): String {
    // 条件によって異なる値で変数を初期化
    val string = if (number < 0) {// 負の数の場合
        "負"
    } else if(number > 0) {// 正の数の場合
        "正"
    } else {// それ以外の場合
        "零"
    }
    return string
}

fun main(args: Array<String>) {
    val a = -10
    val b = 0
    val c = 5
    println("$a -> ${signString(a)}")
    println("$b -> ${signString(b)}")
    println("$c -> ${signString(c)}")
}
```
このプログラムの実行結果は以下のようになります．
```
10 -> Buzz
8 -> 8
9 -> Fizz
90 -> FizzBuzz
```

## `if` `else` による分岐

`if` `else` 式は条件によって異なる値をとります．
`if` `else` 式は以下のように使用します．
```kt
if (条件) {
    条件を満たす場合の値，処理
}
else {
    条件を満たさない場合の値，処理
}
```
`条件` には `Boolean` クラスの値を書きます．

以下のように `else` の後に `if` `else` 式を繰り返すことで複数の条件によって分岐することもできます．
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

## サンプルプログラム 2
```kt
package jumpaku.programming.branches

/**
 * 引数が負の数なら"負", 正の数なら"正", 0なら"零"を返す.
 * @param number 整数
 * @return 変換後の文字列
 */
fun signStringWhen(number: Int): String {
    // 条件によって異なる値で変数を初期化
    val string = when {
        number < 0 -> "負"// 負の数の場合
        number > 0 -> "正"// 正の数の場合
        else -> "零"// それ以外の場合
    }
    return string
}

fun main(args: Array<String>) {
    val a = -10
    val b = 0
    val c = 5
    println("$a -> ${signStringWhen(a)}")
    println("$b -> ${signStringWhen(b)}")
    println("$c -> ${signStringWhen(c)}")
}
```
このプログラムの実行結果は以下のようになります．
```
10 -> Buzz
8 -> 8
9 -> Fizz
90 -> FizzBuzz
```

## `when` による分岐

`when` 式も `if` `else` と同様に分岐することができます．
`when` 式は以下のように書きます．
```kt
when {
    条件 -> 条件を満たす場合の値，処理
    else -> 条件を満たさない場合の値，処理
}
```
`when` 式の `条件` にも `Boolean` クラスの値を書きます．
以下のように条件を増やすこともできます．
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

/**
 * 引数が15の倍数なら"FizzBuzz", 5の倍数なら"Buzz", 3の倍数なら"Fizz", それ以外ならその数字を返す.
 * @param number 整数
 * @return 変換後の文字列
 */
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
    val a = 10
    val b = 8
    val c = 9
    val d = 90
    println("$a -> ${fizzbuzz(a)}")
    println("$b -> ${fizzbuzz(b)}")
    println("$c -> ${fizzbuzz(c)}")
    println("$d -> ${fizzbuzz(d)}")
}
```
