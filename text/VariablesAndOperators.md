# 変数と演算子

## 変数

変数とはメモリ上の領域に格納されたデータを，名前を付けて参照できるようにするものです．
メモリはコンピュータの構成要素の一つで，データを記憶するための装置です．
変数は変数名，値，型を持ちます．
ソースコードでは変数名を使って，変数に格納されているデータの値を参照することができます．
型は変数に格納されているデータの種類やサイズを表します．

### サンプルプログラム 1

```kt
package jumpaku.programming.variablesandoperators

fun main(args: Array<String>) {

    // 変数定義
    val integer = 123
    val real = 123.0
    val character = 'X'
    val string = "abc"
    val truthValue = true

    // 変数の値の出力
    println("変数名 : integer, 型 : ${integer::class}, 値 : $integer")
    println("変数名 : real, 型 : ${real::class}, 値 : $real")
    println("変数名 : character, 型 : ${character::class}, 値 : $character")
    println("変数名 : string, 型 : ${string::class}, 値 : $string")
    println("変数名 : truthValue, 型 : ${truthValue::class}, 値 : $truthValue")
}
```

このプログラムの実行結果は以下のようになります．
```
変数名 : integer, 型 : class kotlin.Int, 値 : 123
変数名 : real, 型 : class kotlin.Double, 値 : 123.0
変数名 : character, 型 : class kotlin.Char, 値 : X
変数名 : string, 型 : class kotlin.String, 値 : abc
変数名 : truthValue, 型 : class kotlin.Boolean, 値 : true
```

### 変数定義

変数を使用するには以下のように変数を定義します．
```kt
val 変数名: 型名 = 初期値
```
変数名はローマ字(`a` から `z` までと `A` から `Z` まで)と数字( `0` から `9` まで)とアンダースコア( `_` )を組み合わせて命名します．
ただし，数字から始まるものや予約語( `package` や `val` などプログラミング言語が使用してているもの)と一致するものは使用できません．

型名は格納したいデータの種類に応じて指定します．
以下に基本的な型を示します．
|    型名   	|       データの形式       	| サイズ [bit] 	|      リテラルの例     	|
|:---------:	|:------------------------:	|:------------:	|:-----------------:	|
| `Int`     	| 整数                     	|           32 	| `-10`, `23`       	|
| `Long`    	| 整数                     	|           64 	| `-10L`, `31L`     	|
| `Float`   	| 実数(単精度浮動小数点数) 	|           32 	| `1.0f`, `3.14f`   	|
| `Double`  	| 実数(倍精度浮動小数点数) 	|           64 	| `1.0`, `3.14`     	|
| `Char`    	| 文字                     	|           16 	| `'A'`, `'あ'`     	|
| `String`  	| 文字列                   	|         可変 	| `"abc"`, `"純白"` 	|
| `Boolean` 	| 真理値                   	|       未定義 	| `true`, `false`   	|

初期値にはリテラルや別の変数，演算結果などを記述します．
初期値から型を推論できる場合は変数定義の `: 型名` を省略できます．

型を自分で作ることもできますが，その詳細については[ クラス ](./Classes.md)で説明します．

`$` や `${}` を用いることで文字列の中に変数の値などを埋め込むことができます．

## 演算

### サンプルプログラム 2
```kt
package jumpaku.programming.variablesandoperators

fun main(args: Array<String>) {
    val x = 87
    val y = 7
    println("数値演算")
    println("x + y = ${x + y}") // 和
    println("x - y = ${x - y}") // 差
    println("x * y = ${x * y}") // 積
    println("x / y = ${x / y}") // 商
    println("x % y = ${x % y}") // 剰余

    println("比較演算")
    println("x == y = ${x == y}") // イコール
    println("x != y = ${x != y}") // ノットイコール
    println("x < y = ${x < y}") // 小なり
    println("x <= y = ${x <= y}") // 小なりイコール
    println("x > y = ${x > y}") // 大なり
    println("x >= y = ${x >= y}") // 大なりイコール

    val t = true
    val f = false
    println("真理値演算")
    println("t && f = ${t && f}") // かつ
    println("t || f = ${t || f}") // または
    println("!t = ${!t}") // 否定
    println("!f = ${!f}") // 否定
}
```
このプログラムの実行結果は以下のようになります．
```
数値演算
x + y = 94
x - y = 80
x * y = 609
x / y = 12
x % y = 3
比較演算
x == y = false
x != y = true
x < y = false
x <= y = false
x > y = true
x >= y = true
真理値演算
t && f = false
t || f = true
!t = false
!f = true
```
### 基本的な演算子

数値( `Int`, `Long`, `Float`, `Double` など)に関する基本的な演算子を以下に示します．
| 演算子 	| 意味 	|
|:------:	|:----:	|
|   `+`  	|  和  	|
|   `-`  	|  差  	|
|   `*`  	|  積  	|
|   `/`  	|  商  	|
|   `%`  	| 剰余 	|

数値の大小関係に関する基本的な演算子を以下に示します．
| 演算子 	|      意味      	|
|:------:	|:--------------:	|
|  `==`  	|    イコール    	|
|  `!=`  	| ノットイコール 	|
|   `<`  	|     小なり     	|
|  `<=`  	| 小なりイコール 	|
|   `>`  	|     大なり     	|
|  `>=`  	| 大なりイコール 	|

これらの演算結果は `Boolean` となります．
`==` や `!=` は厳密な比較をする演算子です．
これらは，浮動小数点数( `Double`, `Float` )の比較には用いません．
これは浮動小数点数が誤差を含むことがあり，厳密な比較に意味が無いためです．

真理値( `Boolean` )に関する基本的な演算子を以下に示します．
| 演算子 	|  意味  	|
|:------:	|:------:	|
|  `&&`  	|  かつ  	|
|  `||`  	| または 	|
|   `!`  	|  否定  	|
これらの演算結果は `Boolean` となります．

### 演算の優先順位

複数の演算子を同時に利用する場合，優先順位の高い演算子から計算されます．
また，`(`, `)` を用いることで演算の優先順位を指定することができます．
演算子の優先順位を以下に示します．

1. `!`
1. `*`, `/`, `%`
1. `+`, `-`
1. `<`, `>`, `<=`, `>=`
1. `==`, `!=`
1. `&&`
1. `||`

## まとめ

1. 変数は変数名，型，値を持ち，データを格納できる．
1. 変数は `val 変数名`(`: 型名`)` = 初期値` と定義する．
1. 演算には以下のようなものがある．
    * 数値の計算を行うもの(`+`, `-`, `*`, `/`, `%`)，
    * 比較を行うもの(`==`, `!=`, `<`, `<=`, `>`, `>=`)，
    * 真理値の計算を行うもの(`&&`, `||`, `!`)

## 練習

1. 下のソースコード内の変数 `name`, `mass`, `height` の型を答えてください．
1. 下のソースコードの実行結果を予想してください．
1. 下のソースコードを編集して，BMIを計算して計算結果を出力するプログラムを作成してください．
1. 下のソースコードを編集して，BMIを計算して計算結果が標準的かどうか( `true` か `false` )を出力するプログラムを作成してください．

```kt
package jumpaku.programming.variablesandoperators

fun main(args: Array<String>) {
    val name = "MPC-Man"
    val mass = 51.7
    val height = 172.8
    println("name: $name, mass: $mass, height: $height")
}
```
