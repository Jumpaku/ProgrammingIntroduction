# 繰り返し

繰り返しとは同じような処理を何度か行うことです．

## `for` による繰り返し
以下は `for` によって処理を繰り返すプログラムです．
```kt
package jumpaku.programming.loops

fun main(args: Array<String>) {
    for (i in 0..4) {
        println("ループカウンタ = $i")
    }
}
```
以下はこのプログラムの実行結果です．
```
ループカウンタ = 0
ループカウンタ = 1
ループカウンタ = 2
ループカウンタ = 3
ループカウンタ = 4
```
`for` は指定された範囲内の要素一つ一つに対して同じような処理を繰り返します．
`for` は以下のように使用します．
```kt
for (変数 in 範囲) {
    処理
}
```

## 範囲演算子
範囲演算子 `..` は指定された値の間の範囲を返します．
`開始の値..終了の値` のように使用します．

## `do` `while` による繰り返し
以下は `do` `while` によって処理を繰り返す処理です．
```kt
package jumpaku.programming.loops

fun main(args: Array<String>) {
    do {// コンソールへの標準入力を繰り返す
        println("input in console")
        // 標準入力の文字列を返すreadLine関数の呼び出し
        val input = readLine()
    } while (input != "OK")// 繰り返しを続ける条件，"OK"が入力されるまで繰り返す

    println("done")
}
```
以下はこのプログラムの実行結果です．
```
input in console
Hello
input in console
NG
input in console
OK
done
```
`do` `while` は条件が満たされている間，同じ処理を繰り返します．
以下は `do` `while` を用いた繰り返しの構文です．
```kt
do {
    処理
} while(条件)
```
条件は `Boolean` 型の値を書きます．

## `readLine` 関数
`readLine` 関数は標準入力の文字列を取得する関数です．
`readLine` 関数はコンソールに文字列が入力され，エンターキーが押されるまで待機します．
エンターキーが押されると，`readLine` 関数は入力した文字列を返します．

## 練習
`1` から `20` までの整数に対して，
それが `15` の倍数なら `"FizzBuzz"`, `5` の倍数なら `"Buzz"`, `3` の倍数なら `"Fizz"`, それ以外ならその数字を表示するプログラムを作成してください．