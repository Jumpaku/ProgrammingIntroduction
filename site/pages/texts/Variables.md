---
layout: page
title: 変数
permalink: /texts/variables/
---
変数とはメモリ上の領域に格納されたデータに名前を付けて参照できるようにするものです．
メモリはコンピュータの構成要素の一つで，データを記憶するための装置です．

## 変数定義
以下は変数を定義し，変数が参照する値を表示するプログラムです．
{% highlight kotlin %}
{% include_relative src/jumpaku/programming/variables/Sample1.kt %}
{% endhighlight %}
以下はその実行結果です．
{% highlight none %}
{% include_relative src/jumpaku/programming/variables/Sample1Result.txt %}
{% endhighlight %}

変数定義とはインスタンスを生成し，変数名とインスタンスを関連づけることです．
インスタンスとはメモリ上の領域に格納されたデータです．
インスタンスの生成では，メモリ上にインスタンスのための領域を確保し，その領域に初期値を格納します．
以下は変数定義とインスタンスの生成，参照を表す図です．

![]({{site.baseurl}}/images/texts/variable.png)

以下は変数定義の構文です．
```kt
val 変数名: 型名 = 初期値
```
変数名にはローマ字(`a` - `z`, `A` - `Z` )と数字( `0` - `9` )とアンダースコア( `_` )を組み合わせを指定します．
ただし，数字から始まるものや予約語( `package` や `val` などプログラミング言語が既に使用している組み合わせ)と一致するものは使用できません．

型名には型の名前を指定します．
型とはデータの形式を表すもので，インスタンスのメモリ上におけるサイズや配置を指定するものです．

初期値にはリテラル，関数の返り値，別の変数などを書きます．
リテラルとは数値や文字列の値を表記するものです．
関数の返り値については[関数]({{ site.baseurl }}/texts/functions/)のページで説明します．

## 基本的な型
以下に基本的な型と初期値の例を示します．

| 型名 | データの形式 | リテラルの例 |
|:---------:|:-------------------------------:|:-------------------:|
| `Int` | 整数(32bit) | `-1`, `23` |
| `Long` | 整数(64bit) | `-1L`, `31L` |
| `Float` | 実数(単精度浮動小数点数(32bit)) | `-1.0f`, `3.14f` |
| `Double` | 実数(倍精度浮動小数点数(64bit)) | `-1.0`, `3.14` |
| `Char` | 文字 | `'A'`, `'あ'` |
| `String` | 文字列 | `"abc"`, `"いろは"` |
| `Boolean` | 真理値 | `true`, `false` |

初期値から型を推論できる場合は変数定義の `: 型名` を省略できます．

以下は基本的な型を持つ変数を使用するプログラムです．
{% highlight kotlin %}
{% include_relative src/jumpaku/programming/variables/Sample2.kt %}
{% endhighlight %}
以下はその実行結果です．
{% highlight none %}
{% include_relative src/jumpaku/programming/variables/Sample2Result.txt %}
{% endhighlight %}
文字列の中で，`$` や `${}` を用いることで文字列の中に変数の値などを埋め込むことができます．

## 高度な型
基本的な型のデータを並べたり，組み合わせたりして，より高度な型を利用することができます．
以下はリスト，データクラスを使用するプログラムです．
{% highlight kotlin %}
{% include_relative src/jumpaku/programming/variables/Sample3.kt %}
{% endhighlight %}
以下はその実行結果です．
{% highlight none %}
{% include_relative src/jumpaku/programming/variables/Sample3Result.txt %}
{% endhighlight %}

### リスト
リストとは同じ型のデータを1列に並べたデータを表すもので，`List<要素の型>` という型を持ちます．
以下はリストを表す図です．

![]({{site.baseurl}}/images/texts/list.png)

以下はリストのインスタンスを生成する構文です．
```kt
listOf(要素,・・・)
```
`Int` 型の添え字 `i` を用いてリストの `i` 番目の要素を参照することができます．
以下はリストの `i` 番目の要素を参照する構文です．
```kt
リスト型の変数[i]
```
添え字は `0` から始まります．

### データクラス
データクラスとは様々なデータを組み合わせたデータを表す型です．
データクラスが内部に持つデータをフィールドと呼びます．
データクラスを利用するには，まず，データクラスを定義します．
データクラスの定義とは，そのデータクラスがどんなデータの組み合わせたものなのかを定めるものです．
以下はデータクラスを表す図です．

![]({{site.baseurl}}/images/texts/dataclass.png)

以下はデータクラス定義の構文です．
```kt
data class クラス名(val フィールド名: フィールドの型,・・・)
```
また，以下はデータクラスのインスタンスを生成する構文です．
```kt
クラス名(フィールドの初期値,・・・)
```
`フィールド名` を用いてそのフィールドを参照することができます．
以下はフィールドを参照する構文です．
```kt
変数.フィールド名
```

## まとめ

1. インスタンスはメモリ上の領域に格納されたデータである．
1. 変数は型を持ち，メモリ上のインスタンスを参照する．
1. 型は整数，実数(浮動小数点数)，文字列，リスト，データクラスといったデータの形式を表す．

## 練習

1. 下のソースコードの変数 `pcName`, `pcPrice`, `pc` の型と値を答えてください．
1. 下のソースコードの変数 `keyboard`, `mouse`, `products` の型と値を答えてください．
1. 下のソースコードの実行結果を予想してください．
1. 下のソースコードの中で `val x = mouse.price` と変数定義した場合の `x` 型と値を答えてください．
1. 下のソースコードの中で `val y = products[1]` と変数定義した場合の `y` 型と値を答えてください．
1. 下のソースコードの中で `val z = products[2].name` と変数定義した場合の `z` 型と値を答えてください．

{% highlight kotlin %}
{% include_relative src/jumpaku/programming/variables/Practice1.kt %}
{% endhighlight %}

## 補足

ここで変数としては紹介したものは正確にはプロパティというものです．