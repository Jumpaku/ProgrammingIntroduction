# 環境構築

本ページでは，
Kotlinでプログラミングをするための環境構築を行い，
プロジェクトを作成し，
簡単なサンプルプログラムを実行します．

## 環境構築

自分のOSに該当する説明に従って環境構築を行います．
<details><summary>macOSの場合</summary><div>

### Homebrew

ターミナルを起動して以下を実行し，Homebrewをインストールする．
```sh
/usr/bin/ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)"
```

### Java

ターミナルで以下を実行し，Javaをインストールする．
```sh
brew cask install java
```

### IntelliJ IDEA CE

以下のリンクからIntelliJ IDEAのCommunityエディションをダウンロードします．
[https://www.jetbrains.com/idea/](https://www.jetbrains.com/idea/)

その後，`/Application` ディレクトリにコピーしてアプリを起動し，指示に従ってセットアップします．

HomebrewはmacOSのパッケージマネージャの一つで，アプリケーションの管理をするためのプログラムです．
Javaはプログラミング言語の一つで，Kotlinを利用するために必要となります．
IntelliJは統合開発環境の一つで，プログラミングをするためのアプリケーションです．
</div></details>

<details><summary>Windowsの場合</summary><div>
</div></details>

<details><summary>Ubuntuの場合</summary><div>

### Java

端末を起動して以下を実行し，Javaをインストールします．
```sh
sudo apt install default-jdk
```

### IntelliJ IDEA CE

以下のリンクからIntelliJ IDEAのCommunityエディションをダウンロードします．

[https://www.jetbrains.com/idea/](https://www.jetbrains.com/idea/)

その後，ダウンロードしたファイルを展開し，`bin/idea.sh`を起動し，指示に従ってセットアップします．

Javaはプログラミング言語の一つで，Kotlinを利用するために必要となります．
IntelliJは統合開発環境の一つで，プログラミングをするためのアプリケーションです．
</div></details>

## プロジェクト作成

プロジェクトを作成します．
プロジェクトとは統合開発環境を用いた一つの開発における設定ファイルやソースコードをまとめたものです．

プロジェクトの作成手順を以下に示します．

1. IntelliJを起動する．
1. [File]-->[New]-->[Project...]と選択する．
1. [Kotlin]-->[Kotlin/JVM]と選択し，[Next]ボタンを押す．
1. プロジェクト名(ここでは `ProgramingIntroduction` )を入力し，[Finish]ボタンを押す．

以下にその操作例を示します．

[![](https://img.youtube.com/vi/BV8Xa2nfn3c/0.jpg)](https://www.youtube.com/watch?v=BV8Xa2nfn3c)

以上より，`~/IdeaProjects/ProgramingIntroduction/` というディレクトリが作成されます．
このディレクトリが本文書で使用するプロジェクトとなります．

## サンプルプログラム

ソースコードを作成し，プログラムを実行します．

以下のソースコードを作成します．

`src/jumoaku/programingintroduction/page1/Sample1.kt`
```kt
// パッケージ宣言
package jumpaku.programming.page1

// main関数の定義
fun main(args: Array<String>) {
    // println関数の呼び出し
    println("Getting started programming")
}
```

その後，このプログラムを実行(Run)します．
すると，コンパイルと実行が行われ，以下の英文が出力されます．
```
Getting started programming
```

以下にその操作例を示します．

[![](https://img.youtube.com/vi/-TVzzuHAdcg/0.jpg)](https://www.youtube.com/watch?v=-TVzzuHAdcg)

## サンプルプログラムの説明

### コメントアウト

`//` を書くとその行の `//` 以降の部分はコンパイル時に無視されます．
これをコメントアウトと呼びます．
コメントアウトすることで，ソースコードに説明を付けることができます．
`/*` と `*/`で囲むことで行を跨いでコメントアウトすることができます．

### パッケージ

ファイルの先頭で
```kt
package パッケージ名
```
と書くことで，ソースコードが所属するパッケージを指定することができます．
パッケージはソースコード内に定義された識別子名の衝突を防いだり，関連するファイルをグループ化するために使用されます．

### main関数

プログラムは `main` 関数から始まります．
関数について詳しくは[ 関数 ](Functions.md)で説明します．

### println関数

`println` 関数はターミナルに文字を出力するために使用する関数です．
出力する内容を `(` と `)` の間に書きます．
`"`, `"` で囲まれたものを文字列と呼びます．

## まとめ

1. 本文書ではKotlinでプログラミングするために以下を準備する必要がある．
    * JDK
    * IntelliJ
1. プロジェクトの作成方法を以下に示す．
[![](https://img.youtube.com/vi/BV8Xa2nfn3c/0.jpg)](https://www.youtube.com/watch?v=BV8Xa2nfn3c)
1. ソースコードの作成と実行方法を以下に示す．
[![](https://img.youtube.com/vi/-TVzzuHAdcg/0.jpg)](https://www.youtube.com/watch?v=-TVzzuHAdcg)
1. プログラムは `main` 関数から始まる．
1. ターミナルに実行結果を出力するには `println` 関数を利用する．

## 練習
`Practice1` というプロジェクトを新たに作成し，
ターミナルに自分の名前を出力するプログラムを作成してください．