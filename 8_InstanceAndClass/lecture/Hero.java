// 「登場人物」クラス
public class Hero {
  // 属性の宣言（field(クラス内で宣言された変数)の宣言）
  String name; //名前の宣言
  int hp; // HPの宣言
  // フィールドの宣言時にフィールドの初期値を設定することも可能
  int level = 10; // level変数の初期値は「10」

  // 「操作」の宣言
  public void sleep() {
    this.hp = 100;
    System.out.println(this.name + "は、眠って回復した！");
  }

  public void sit(int sec) {
    this.hp += sec;
    System.out.println(this.name + "は、" + sec + "秒座った！");
    System.out.println("HPが" + sec + "ポイント回復した");
  }

  public void slip() {
    this.hp -= 5;
    System.out.println(this.name + "は、転んだ！");
    System.out.println("5のダメージ！");
  }

  public void run() {
    System.out.println(this.name + "は、逃げ出した!");
    System.out.println("GAMEOVER");
    System.out.println("最終HPは" + this.hp + "でした");
  }
}