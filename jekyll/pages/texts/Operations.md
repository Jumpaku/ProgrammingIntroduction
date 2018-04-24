---
layout: page
title: 演算
permalink: /texts/operations/
---
演算とは演算子という記号を用いた基本的な計算のことです．

## 四則演算
以下は数値の四則演算を行うプログラムです．
{% highlight kotlin %}
{% include_relative src/jumpaku/programming/operations/Sample1.kt %}
{% endhighlight %}
以下はその実行結果です．
{% highlight none %}
{% include_relative src/jumpaku/programming/operations/Sample1Result.txt %}
{% endhighlight %}

数値( `Int`, `Long`, `Float`, `Double` など)に関する演算子を以下に示します．

| 演算子 | 意味 |   使用例 (Int)  | 使用例 (Double)       |
|:------:|:----:|:---------------:|-----------------------|
| `+`    | 和   | `1 + 2 // 3`    | `1.0 + 2.5 // 3.5`    |
| `-`    | 差   | `1 - 2 // -1`   | `3.5 - 2.5 // 1.0`    |
| `*`    | 積   | `-2 * 6 // -12` | `-2.5 * 2.0 // -5.0 ` |
| `/`    | 商   | `7 / 2 // 3`    | `7.0 / 2.0 // 3.5`    |
| `%`    | 剰余 | `7 % 2 // 1`    | `13.0 % 2.5 // 0.5`   |

## リスト，文字列の演算
以下は文字列の演算を行うプログラムです．
{% highlight kotlin %}
{% include_relative src/jumpaku/programming/operations/Sample2.kt %}
{% endhighlight %}
以下はその実行結果です．
{% highlight none %}
{% include_relative src/jumpaku/programming/operations/Sample2Result.txt %}
{% endhighlight %}

文字列やリストといった列に関する演算子を以下に示します．

| 演算子 | 意味 |       使用例 (String)       | 使用例 (List<Int>)                            |
|:------:|:----:|:---------------------------:|-----------------------------------------------|
| `+`    | 結合   | `"abc" + "def" // "abcdef"` | `listOf(1, 0) + listOf(8, 9) // [1, 0, 8, 9]` |
| `in`   | 含むかどうか   | `"xyz" in xzxyzz // true`   | `5 in listOf(2, 8, 3) // false`               |

`in` の演算結果は `Boolean` となります．

## 比較演算
以下は文字列や数値の比較演算を行うプログラムです．
{% highlight kotlin %}
{% include_relative src/jumpaku/programming/operations/Sample3.kt %}
{% endhighlight %}
以下はその実行結果です．
{% highlight none %}
{% include_relative src/jumpaku/programming/operations/Sample3Result.txt %}
{% endhighlight %}

比較に関する演算子を以下に示します．

| 演算子 	|      意味      	|
|:------:	|:--------------:	|
|  `==`  	|    イコール    	|
|  `!=`  	| ノットイコール 	|
|   `<`  	|     小なり     	|
|  `<=`  	| 小なりイコール 	|
|   `>`  	|     大なり     	|
|  `>=`  	| 大なりイコール 	|

これらの演算結果は `Boolean` となります．
文字列の大小は辞書順に比較されます．

## 論理演算
以下は真理値の演算を行うプログラムです．
{% highlight kotlin %}
{% include_relative src/jumpaku/programming/operations/Sample4.kt %}
{% endhighlight %}
以下はその実行結果です．
{% highlight none %}
{% include_relative src/jumpaku/programming/operations/Sample4Result.txt %}
{% endhighlight %}

真理値( `Boolean` )に関する基本的な演算子を以下に示します．

| 演算子 	|  意味  	|
|:------:	|:------:	|
|  `&&`  	|  かつ  	|
|  `||`  	| または 	|
|   `!`  	|  否定  	|

これらの演算結果は `Boolean` となります．

### 演算の優先順位
複数の演算子を同時に利用する場合，優先順位の高い演算子から計算されます．
以下は演算子の優先順位です．

1. `!`
1. `*`, `/`, `%`
1. `+`, `-`
1. `<`, `>`, `<=`, `>=`
1. `==`, `!=`
1. `&&`
1. `||`

また， `(`, `)` で囲まれた部分は優先されるため，
以下のように演算の優先順位を指定することができます．
```kt
(2 + 7) * (3 - 5) // -18
```

## まとめ

1. 演算とは演算子を用いた基本的な計算のことである．
1. 演算には数値の四則演算の他に文字列の結合，大小比較，論理演算などがある．
1. 演算子には優先順位があるが，`(`, `)` が優先される．

## 練習

1. 下のソースコード内の変数 `name`, `mass`, `height` の型を答えてください．
1. 下のソースコードの実行結果を予想してください．
1. 下のソースコードを編集して，BMIを計算して計算結果を出力するプログラムを作成してください．
1. 下のソースコードを編集して，BMIを計算して計算結果が標準的かどうか(BMIが `18.5` 以上かつ `25.0` 未満であるかどうか( `true` か `false` ))を出力するプログラムを作成してください．

```kt
package jumpaku.programming.operators

fun main(args: Array<String>) {
    val name = "MPC-Man"
    val mass = 51.7 //kg
    val height = 1.728 //m
    println("name: $name, mass: $mass, height: $height")
}
```
