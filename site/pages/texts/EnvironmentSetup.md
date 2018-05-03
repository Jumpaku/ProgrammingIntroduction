---
layout: page
title: 環境構築
permalink: /texts/environmentsetup/
---
ここでは，
Kotlinでプログラミングをするための環境構築を行い，
プロジェクトを作成し，
簡単なサンプルプログラムを実行するまでの作業について解説します．

## 環境構築
自分のOSに該当する説明に従って環境構築を行います．

<details>
<summary>
macOSの場合
</summary>
<div>

#### Homebrew
ターミナルを起動して以下を実行し，Homebrewをインストールする．
```sh
/usr/bin/ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)"
```

#### Java
ターミナルで以下を実行し，Javaをインストールする．
```sh
brew cask install java
```

#### IntelliJ IDEA CE
以下のリンクからIntelliJ IDEAのCommunityエディションをダウンロードします．
[https://www.jetbrains.com/idea/](https://www.jetbrains.com/idea/)

その後，`/Application` ディレクトリにコピーしてアプリを起動し，指示に従ってセットアップします．

HomebrewはmacOSのパッケージマネージャの一つで，アプリケーションの管理をするためのプログラムです．
Javaはプログラミング言語の一つで，Kotlinを利用するために必要となります．
IntelliJは統合開発環境の一つで，プログラミングをするためのアプリケーションです．

</div>
</details>

<details>
<summary>
Windowsの場合
</summary>
<div>

#### Chocolatey
PowerShellを管理者として起動して以下を実行し，Chocolateyをインストールする．
```sh
Set-ExecutionPolicy Bypass -Scope Process -Force; iex ((New-Object System.Net.WebClient).DownloadString('https://chocolatey.org/install.ps1'))
```

#### Java
PowerShellで以下を実行し，Javaをインストールする．
```sh
choco install jdk10 -y
```

#### IntelliJ IDEA CE
以下のリンクからIntelliJ IDEAのCommunityエディションのインストーラをダウンロードします．
[https://www.jetbrains.com/idea/](https://www.jetbrains.com/idea/)

その後，インストーラを起動し，指示に従ってセットアップします．

ChocolateyはWindowsのパッケージマネージャの一つで，アプリケーションの管理をするためのプログラムです．
Javaはプログラミング言語の一つで，Kotlinを利用するために必要となります．
IntelliJは統合開発環境の一つで，プログラミングをするためのアプリケーションです．

</div>
</details>

<details>
<summary>
Ubuntuの場合
</summary>
<div>

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
</div>
</details>

## プロジェクト作成
プロジェクトとは一つの開発における設定ファイルやソースコードをまとめたものです．

以下はプロジェクトの作成手順です．
1. IntelliJを起動する．
1. [File]-->[New]-->[Project...]と選択する．
1. [Kotlin]-->[Kotlin/JVM]と選択し，[Next]ボタンを押す．
1. プロジェクト名(ここでは `ProgramingIntroduction` )を入力し，[Finish]ボタンを押す．
この時，Windowsにおいて，Project SDK: に "No SDK" と表示されている場合は以下のフォルダを指定します．
```
C:\Program Files\Java\jdk-10.0.1
```

説明だけでは伝わらないため，以下にその操作例の動画を示します．

<iframe width="560" height="315" src="https://www.youtube.com/embed/BV8Xa2nfn3c" frameborder="0" allow="autoplay; encrypted-media" allowfullscreen></iframe>

以上より，`~/IdeaProjects/ProgramingIntroduction/` というディレクトリが作成されます．
このディレクトリが本文書で使用するプロジェクトとなります．



## サンプルプログラム
以下のソースコードを作成してください．
{% highlight kotlin %}
{% include_relative src/jumpaku/programming/environmentsetup/Sample1.kt %}
{% endhighlight %}
その後，このプログラムを実行(Run)します．
すると，コンパイルと実行が行われ，以下の行が出力されます．
{% highlight none %}
{% include_relative src/jumpaku/programming/environmentsetup/Sample1Result.txt %}
{% endhighlight %}

説明だけでは伝わらないため，以下にその操作例の動画を示します．

<iframe width="560" height="315" src="https://www.youtube.com/embed/524AHnC9l9Y?rel=0" frameborder="0" allow="autoplay; encrypted-media" allowfullscreen></iframe>

## サンプルプログラムの説明
上のプログラムを説明します．
この段階で以下の説明を理解できない場合は，
そういうおまじないだと思っていただいても問題無いと思います．

### コメントアウト
`//` を書くとその行の `//` 以降の部分はコンパイル時に無視されます．
これをコメントアウトと呼びます．
コメントアウトすることで，ソースコードに説明を付けることができます．
`/*` と `*/`で囲むことで行を跨いでコメントアウトすることができます．

### パッケージ
パッケージとはソースコードが所属する「まとまり」のことで，
名前の衝突を防いだり，関連するファイルをまとめるために使用されます．
以下はパッケージを指定する構文です．
```kt
package パッケージ名
```
パッケージ指定はファイルの一番上でに書きます．

### main関数
プログラムは `main` 関数から始まります．
関数について詳しくは[ 関数 ](Functions.md)で説明します．

### println関数
`println` 関数はターミナルに文字列を出力するために使用する関数です．
出力する内容を `(` と `)` の間に書きます．
`"`, `"` で囲まれたものを文字列と呼びます．

## まとめ
1. 本文書ではKotlinでプログラミングするために以下を準備する必要があります．
    * JDK
    * IntelliJ
1. プロジェクトの作成方法，ソースコードの作成と実行方法を習得しました．
1. プログラムは `main` 関数から始まります．
1. ターミナルに実行結果を出力するには `println` 関数を利用します．

## 練習
`Practice1` というプロジェクトを新たに作成し，
ターミナルに自分の名前を出力するプログラムを作成してください．