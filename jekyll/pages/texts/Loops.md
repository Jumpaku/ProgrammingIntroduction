---
layout: page
title: 繰り返し
permalink: /texts/loops/
---
繰り返しとは同じような処理を何度か行うことです．

## for による繰り返し
以下は `for` によって処理を繰り返すプログラムです．
{% highlight kotlin %}
{% include_relative src/jumpaku/programming/loops/Sample1.kt %}
{% endhighlight %}
以下はその実行結果です．
{% highlight none %}
{% include_relative src/jumpaku/programming/loops/Sample1Result.txt %}
{% endhighlight %}

`for` は指定された範囲内の要素一つ一つに対して同じような処理を繰り返します．
`for` は以下のように使用します．
```kt
for (変数 in 範囲) {
    処理
}
```
変数は範囲に含まれる値を一つ一つ参照します．

## レンジ
ここで，`開始の値..終了の値` はレンジというもので，
`開始の値` から `終了の値` までの範囲に含まれる要素の列を表します．
レンジやリストのようなデータが並んだ列データをコレクションと呼びます．
コレクションについては，[コレクション]({{ site.baseurl }}/texts/collections/)で説明します．

## do while による繰り返し
以下は `do` `while` によって処理を繰り返す処理です．
{% highlight kotlin %}
{% include_relative src/jumpaku/programming/loops/Sample2.kt %}
{% endhighlight %}
以下はそのプログラムへの入力です．
{% highlight kotlin %}
{% include_relative src/jumpaku/programming/loops/Sample2Input.txt %}
{% endhighlight %}
以下はその入力に対する実行結果です．
{% highlight none %}
{% include_relative src/jumpaku/programming/loops/Sample2Result.txt %}
{% endhighlight %}

`do` `while` は条件が満たされている間，同じ処理を繰り返します．
以下は `do` `while` を用いた繰り返しの構文です．
```kt
do {
    処理
} while(継続条件)
```
条件には `Boolean` 型の値を書きます．

## `readLine` 関数
`readLine` 関数は標準入力の文字列を取得する関数です．
`readLine` 関数はコンソールに文字列が入力され，エンターキーが押されるまで待機します．
エンターキーが押されると，`readLine` 関数は入力した文字列を返します．

## まとめ
1. 繰り返しとは同じような処理を何度か行うことである．
1. 繰り返しを実装するには `for` を用いる方法や `do` `while` を用いる方法等がある．

## 練習
`1` から `20` までの整数に対して，
それが `15` の倍数なら `"FizzBuzz"`, `5` の倍数なら `"Buzz"`, `3` の倍数なら `"Fizz"`, それ以外ならその数字を表示するプログラムを作成してください．

## 補足
繰り返しの構文には `for`, `do` `while` の他に以下の `while` 構文があります．

```kt
while(継続条件) {
    処理
}
```

繰り返しは上で紹介した構文の他に，[コレクション]({{ site.baseurl }}/texts/collections/)の機能を利用して実装することができます．
