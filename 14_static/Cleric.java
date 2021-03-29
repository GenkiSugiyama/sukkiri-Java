import java.util.Random;

public class Cleric {
  // フィールドの宣言
  String name;
  int hp = 50;
  final int MAXHP = 50;
  int mp = 10;
  final int MAXMP = 10;

  public void selfAid() {
    this.hp = this.MAXHP;
    this.mp -= 5;
  }

  public int pray(int sec) {
    // 祈った秒数による回復量を計算
    int random = new Random(3).nextInt();
    int recoveryMp = sec + random;

    // 最大値以上は回復しないので、「現在のMPと最大MPの差分」と「祈った回復量」を比較し、数値が小さい方を「実際の回復量」とする
    int actualRecoverMp = Math.min((this.MAXMP - this.mp), recoveryMp);

    // 実際の回復量を現在のMPフィールドの加算する
    this.mp += actualRecoverMp;

    return actualRecoverMp;
  }
}