**Unix問題計10点**

1.Bashの特徴について一つ以上書け。

2.ホームディレクトリに行くコマンドを書け。

3.現在いる場所の確認コマンドを書け。

4.絶対パスと相対パスの違いを一つ以上書け。

5.一つ前にいた場所に戻るコマンドを書け。

6.file1.txtという空ファイル作成のコマンドをかけ。

7.file1.txtというファイルに、memo2と追記するコマンドを書け。

8.file1をコピーしてfile2を作るコマンドを書け。

9.bashTestフォルダを、~/Documents/内に複製するコマンドを書け。

10.bashTestフォルダを削除するコマンドを書け。

Vim問題計10点

11.行全体の変更を取り消すコマンドを書け。

12.カーソル位置から行末までを変更するコマンドを書け。

13.TESTという新しいファイルを作るコマンドを書け。

14.カーソル位置にTESTというファイルの中身を挿入するコマンドを書け。

15.2文字以上を削除して置換する際のコマンドを書け。

16.1行下の行末まで移動するコマンドを書け。

17.テキストをコピーする際のビジュアルモードを開始するコマンドを書け。

18.単語を検索する際に、その単語が見やすくなるよう強調するコマンドを書け。

19.HELPキーとF1キーが使えない場合、ヘルプを開始するコマンドを書け。

Git問題計10点

21.作成したフォルダをGitの管理下に置くためのコマンドをかけ。

22.現在の状況を確認するコマンドを書け。

23.test.txtというファイルの変更情報をステージングエリアに上げるコマンドを書け。

24.266fというハッシュ値でコミットしたオブジェクトに戻りたいときのコマンドを書け。

25.devという新しいブランチを作成するコマンドを書け。

26.devでの変更を取り込むため、masterブランチにcheckoutした後に入力するコマンドを書け。

27.いらなくなったdevブランチを削除するコマンドを書け。

30.

31.

32.

33.

34.

35.

36.

37.

38.

39.

40.

41.

42.

43.

44.

45.

46.

47.

48.

49.

50.

**Java問題系50点**
```
51.以下の●の部分に、正しい処理を記述せよ（文字数は自由）。

public class Main {
  public static void main(String[] args) {
    int x=10;
    int count=3;
    while(count > 0){
      x += 5;
      ●●●●●●●
    }
    System.out.println("Ans:"+ x);
  }
}
```
```
52.以下の●の部分に、正しい処理を記述せよ（文字数は自由）。

public class Main {
  public static void main(String[] args) {
    System.out.print("Bashでフォルダごと削除する際につけるオプションは何?1:-u,2:-f,3:-r　>");
    int num=new java.util.Scanner(System.in).nextInt();
    switch(num){
      case 3:
        System.out.println("OK!");
        break;
        ●●●●●●●●●
        System.out.println("NG");
    }
  }
}
```
```
53.以下の●の部分に、正しい処理を記述せよ（文字数は自由）。

public class Main {
  public static void main(String[] args) {
    int count=0;
    int num;
    do{
      num=new java.util.Random().nextInt(101);
      ●●●●●●●●●
    }●●●●●●●●●
    System.out.println(count+"回目に100が出ました！");
  }
}
```
```
54.以下の●の部分に、正しい処理を記述せよ（文字数は自由）。

import java.util.*;
public class Main {
	public static void main(String[] args) {
    final int LUCKY_NO=777;
		int count=0;
    Random rand=new Random();
		while(true){
			●●●●●●●●●
      ●●●●●●●●●
      ●●●●●●●●●
      ●●●●●●●●●
			}
		}
		System.out.println(LUCKY_NO+"は" + count + "回目に出ました。");
	}
}
```
```
55.以下の●の部分に、正しい処理を記述せよ（文字数は自由）。
