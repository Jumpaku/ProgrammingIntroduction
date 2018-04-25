---
layout: page
title: コレクション
permalink: /texts/collections/
---
リスト，文字列，レンジ等は「複数の同じ型のデータを集めて1列に並べたデータ」と考えることができます．
このようなデータをコレクションと呼びます．
コレクションの操作ではLambda式を用いた一括処理を行うことができます．
Lambda式は関数を簡単に記述するものです．

## Lambda式
Lambda式とは関数のように呼び出すことができる処理です．
以下はLambda式を参照する変数を定義し，Lambda式を呼び出すプログラムです．
{% highlight kotlin %}
{% include_relative src/jumpaku/programming/collections/Sample1.kt %}
{% endhighlight %}
以下はその実行結果です．
{% highlight none %}
{% include_relative src/jumpaku/programming/collections/Sample1Result.txt %}
{% endhighlight %}

以下はLambda式の構文です．
```kt
{ 仮引数名: 仮引数の型,・・・ -> 処理 }
```
Lambda式は処理の最後に記述された値を返します．
また，Lambda式の型は `(引数の型,・・・) -> 返り値の型` となります．
例えば，`{ x: Double -> x*2.0 }` の型は `(Double)->Double` となります．
Lambda式の引数の型を推論できる場合は `: 仮引数の型` を省略できます．

引数の無いLambda式は単に `{ 処理 }` と記述します．
引数が一つのLambda式は引数を省略して `{ 処理 }` と記述することができます．
このとき，`処理` の中で引数を使用する場合は `it` を使用します．
例えば，
```kt
val times2: (Double)->Double = { x -> x*2.0 }
```
は
```kt
val times2: (Double)->Double = { it*2.0 }
```
と記述することができます．

簡単な処理であれば，関数を定義するより，Lambda式で記述した方がソースコードがシンプルになります．

## コレクションの操作
ここではコレクションの基本的な操作として，
`forEach` メソッド, `map` メソッド, `filter` メソッド, `fold` メソッドを説明します．

### forEach
`forEach` メソッドはコレクションの全ての要素に対して，
引数で受け取った処理を実行するメソッドです．
以下は条件によって分岐する処理を表す図です．

![]({{site.baseurl}}/images/texts/foreach.png)

以下はコレクションの `forEach` メソッドを使用するプログラムです．
{% highlight kotlin %}
{% include_relative src/jumpaku/programming/collections/Sample2.kt %}
{% endhighlight %}
以下はその実行結果です．
{% highlight none %}
{% include_relative src/jumpaku/programming/collections/Sample2Result.txt %}
{% endhighlight %}

### map
`map` メソッドはコレクションの全ての要素に対して，
引数で受け取った処理を実行し，実行結果を要素とする新たなコレクションを返すメソッドです．
以下は条件によって分岐する処理を表す図です．

![]({{site.baseurl}}/images/texts/map.png)

以下はコレクションの `map` メソッドを使用するプログラムです．
{% highlight kotlin %}
{% include_relative src/jumpaku/programming/collections/Sample3.kt %}
{% endhighlight %}
以下はその実行結果です．
{% highlight none %}
{% include_relative src/jumpaku/programming/collections/Sample3Result.txt %}
{% endhighlight %}

### filter
`filter` メソッドはコレクションの全ての要素に対して，
引数で受け取った条件を満たすものだけを取り出し，
これら要素とする新たなコレクションを返すメソッドです．
以下は条件によって分岐する処理を表す図です．

![]({{site.baseurl}}/images/texts/filter.png)

以下はコレクションの `filter` メソッドを使用するプログラムです．
{% highlight kotlin %}
{% include_relative src/jumpaku/programming/collections/Sample4.kt %}
{% endhighlight %}
以下はその実行結果です．
{% highlight none %}
{% include_relative src/jumpaku/programming/collections/Sample4Result.txt %}
{% endhighlight %}

### fold
`fold` メソッドはコレクションの全ての要素に対して，
引数で受け取った条件を満たすものだけを取り出し，
これら要素とする新たなコレクションを返すメソッドです．
以下は条件によって分岐する処理を表す図です．

![]({{site.baseurl}}/images/texts/fold.png)

以下はコレクションの `fold` メソッドを使用するプログラムです．
{% highlight kotlin %}
{% include_relative src/jumpaku/programming/collections/Sample5.kt %}
{% endhighlight %}
以下はその実行結果です．
{% highlight none %}
{% include_relative src/jumpaku/programming/collections/Sample5Result.txt %}
{% endhighlight %}

## 練習 1
下のソースコードは`1` から `20` までの整数に対して，
それが `15` の倍数なら `"FizzBuzz"`, `5` の倍数なら `"Buzz"`, `3` の倍数なら `"Fizz"`, それ以外ならその数字を表示するプログラムです．
`/* Lambda式 */` の部分を埋めてプログラムを完成させてください．
{% highlight kotlin %}
{% include_relative src/jumpaku/programming/collections/Practice1.kt %}
{% endhighlight %}

## 練習 2
整数列 [0, 1, 5, -3, 7, -4, 2, 8, 8, 3, -4, 0] の要素の中で，0より大きいものすべての積を計算し，計算結果を出力するプログラムを作成してください．