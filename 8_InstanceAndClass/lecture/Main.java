// 「神様」クラス
public class Main {
  public static void main(String[] args) {
    // 勇者クラスのインスタンスの作成
    Hero h = new Hero();
    // Heroクラスで定義したフィールドに値を代入する
    h.name = "ミナト";
    h.hp = 100;
    System.out.println("勇者" + h.name + "を生み出しました!");
    // メソッドの呼び出し
    h.sit(5); // 5秒座る
    h.slip(); //転ける
    h.sit(25); // 25秒座る
    h.run(); //逃げる
  }
}