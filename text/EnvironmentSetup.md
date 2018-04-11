# 環境構築

本ページでは，
Kotlinでプログラミングをするための環境構築を行い，
プロジェクトを作成し，
簡単なサンプルプログラムを実行します．

## 環境構築

<details><summary>macOSの場合</summary><div>

1. **Homebrew:** 
ターミナルを起動して以下を実行し，Homebrewをインストールする．
```sh
/usr/bin/ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)"
```
1. **Java:** ターミナルで以下を実行し，Javaをインストールする．
```sh
brew cask install java
```
1. **IntelliJ IDEA CS:** 以下のリンクからIntelliJ IDEAのCommunityエディションをダウンロードします．  
[https://www.jetbrains.com/idea/](https://www.jetbrains.com/idea/)  
その後，`/Application` ディレクトリにコピーしてアプリを起動し，指示に従ってセットアップします．

HomebrewはmacOSのパッケージマネージャの一つで，アプリケーションの管理をするためのプログラムです．
Javaはプログラミング言語の一つで，Kotlinを利用するために必要となります．
IntelliJは統合開発環境の一つで，プログラミングをするためのアプリケーションです．

</div></details>

<details><summary>Windowsの場合</summary><div>
</div></details>

<details><summary>Ubuntuの場合</summary><div>

1. **Java:** 端末を起動して以下を実行し，Javaをインストールします．  
```sh
sudo apt install default-jdk
```
1. **IntelliJ IDEA CS:** 以下のリンクからIntelliJ IDEAのCommunityエディションをダウンロードします．  
[https://www.jetbrains.com/idea/](https://www.jetbrains.com/idea/)  
その後，ダウンロードしたファイルを展開し，`bin/idea.sh`を起動し，指示に従ってセットアップします．

Javaはプログラミング言語の一つで，Kotlinを利用するために必要となります．
IntelliJは統合開発環境の一つで，プログラミングをするためのアプリケーションです．

</div></details>

## プロジェクト作成

本文書ではプログラミングをプロジェクト単位で行います．
プロジェクトとは統合開発環境を用いた一つの開発における設定ファイルやソースコードをまとめたものです．

プロジェクトの作成手順を以下に示します．

1. IntelliJを起動する．
1. [File]-->[New]-->[Project...]と選択する．
1. [Kotlin]-->[Kotlin/JVM]と選択し，[Next]ボタンを押す．
1. プロジェクト名(ここでは `ProgramingIntroduction` )を入力し，[Finish]ボタンを押す．

以上より，`~/IdeaProjects/ProgramingIntroduction/` というディレクトリが作成されます．
このディレクトリが本文書で使用するプロジェクトとなります．

## サンプルプログラム

以下のファイルを作成します．

`src/jumoaku/programingintroduction/page1/Sample1.kt`
```kt
// コメント
/*
    コメント
*/

package jumpaku.programingintroduction.page1 //パッケージ宣言

fun main(args: Array<String>) { //main関数の定義
    println("Getting started programming.") //println関数の呼び出し
}
```

緑の三角ボタンを押してこのプログラムを実行(Run)します．
すると以下の英文が出力されます．

```
Getting started programming.
```

### パッケージ

### 関数

### 標準出力

### 文字列
