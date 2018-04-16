# 分岐

分岐とは条件によって異なる値になったり，処理をしたりすることです．

## サンプルプログラム 1
```kt
package jumpaku.programming.branches

/**
 * 引数が15の倍数なら"FizBuzz", 5の倍数なら"Buzz", 3の倍数なら"Fizz", それ以外ならその数字を返す.
 * @param number 整数
 * @return 変換後の文字列
 */
fun fizzbuzz(number: Int): String {
    // 条件によって異なる値で変数を初期化
    val string = if (number%15 == 0) {// 15の倍数である条件
        "FizzBuzz"// 15の倍数である時の値
    } else if (number%5 == 0) {// 5の倍数である条件
        "Buzz"// 5の倍数である時の値
    } else if (number%3 == 0) {// 3の倍数である条件
        "Fizz"// 3の倍数である時の値
    } else {// 上のどれでもない条件
        // IntクラスのtoStringメソッドの呼び出し，数値を文字列に変換
        number.toString()// 上のどれでもない時の値
    }
    // 変数を返す
    return string
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
 * Int型の数値を文字列に変換する.
 * ただし, 引数が3の倍数か3の付く数字なら文字列の末尾に"!"を付加する.
 * @param number 整数
 * @return 変換後の文字列
  */
fun nabeatsu(number: Int): String {
    // IntクラスのtoStringメソッドを呼び出し，数値を文字列に変換
    val numberString = number.toString()
    // 条件によって異なる値で変数を初期化
    val end = when {
        // 3の倍数なら末尾に付加する文字を"!"にする
        number%3 == 0 -> "!"
        // 3の倍数なら末尾に付加する文字を"!"にする
        // Stringクラスのcontainsメソッドを呼び出し，
        // numberStringが"3"を含むかどうかを調べる．
        numberString.contains("3") -> "!"
        // どの条件も満たさないなら末尾に付加する文字を空にする
        else -> ""
    }
    return numberString + end
}

fun main(args: Array<String>) {
    val a = 11
    val b = 12
    val c = 13
    println("$a -> ${nabeatsu(a)}")
    println("$b -> ${nabeatsu(b)}")
    println("$c -> ${nabeatsu(c)}")
}
```
このプログラムの実行結果は以下のようになります．
```
11 -> 11
12 -> 12!
13 -> 13!
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

1. 下のソースコードの実行結果を予想してください．
1. 下のソースコードに，GPに応じてメッセージを出力する `advise(gp: Int)` 関数を追加してください．ただし，出力されるメッセージは以下の通りとします．
    * gpが `0` または `1` の場合： `"頑張りましょう．"`
    * gpが `2` または `3` の場合： `"その調子です．"`
    * gpが `4` の場合： `"素晴らしい．"`
    * それ以外の場合： `"入力が間違っています．"`
1. `math`, `programming`, `english`, `economics`, `chinese` のれぞれの点数に対して，GPを求め，メッセージを出力してください．
```kt
package jumpaku.programming.branches

/**
 * 点数に応じたGPを返します．
 * @param score 点数
 * @return GP
 */
fun gradePoint(score: Int): Int {
    return when {
        score < 60 -> 0
        score < 70 -> 1
        score < 80 -> 2
        score < 90 -> 3
        else -> 4
    }
}

fun main(args: Array<String>) {
    val math = 100
    val programming = 90
    val english = 89
    val economics = 59
    val chinese = 60
    println("math: $math -> ${gradePoint(math)}")
    println("programming: $programming -> ${gradePoint(programming)}")
    println("english: $english -> ${gradePoint(english)}")
    println("economics: $economics -> ${gradePoint(economics)}")
    println("chinese: $chinese -> ${gradePoint(chinese)}")
}
```
