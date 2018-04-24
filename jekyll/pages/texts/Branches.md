---
layout: page
title: 分岐
permalink: /texts/branches/
---
分岐とは条件によって異なる計算や処理をすることです．
以下は条件によって分岐する処理を表す図です．

![]({{site.baseurl}}/images/texts/branch.png)

## if else による分岐
以下は条件によって異なる値を出力するプログラムです．
{% highlight kotlin %}
{% include_relative src/jumpaku/programming/branches/Sample1.kt %}
{% endhighlight %}
以下はその実行結果です．
{% highlight none %}
{% include_relative src/jumpaku/programming/branches/Sample1Result.txt %}
{% endhighlight %}

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

## when による分岐
`if` `else` の他に `when` を使うこともできます．
以下は上のプログラムを `when` を使って書き直したものです．
{% highlight kotlin %}
{% include_relative src/jumpaku/programming/branches/Sample2.kt %}
{% endhighlight %}
以下はその実行結果です．
{% highlight none %}
{% include_relative src/jumpaku/programming/branches/Sample2Result.txt %}
{% endhighlight %}

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

## まとめ
1. 分岐とは条件によって異なる計算や処理をすることである．
1. 分岐を実装するには `if` `else` を用いる方法と `when` を用いる方法がある．

## 練習

1. 下のソースコード内の変数 `string` の型を答えてください．
1. 下のソースコードの実行結果を予想してください．
1. 下のソースコードの `if` `else` を `when` 書き換えてください．

{% highlight kotlin %}
{% include_relative src/jumpaku/programming/branches/Practice1.kt %}
{% endhighlight %}