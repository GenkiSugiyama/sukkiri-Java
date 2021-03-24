public class Matango {
  int hp = 50;
  char suffix;
  public Matango(char suffix) {
    this.suffix = suffix;
  }
  public void attac(Hero h) {
    System.out.println("キノコ" + this.suffix + "の攻撃");
    System.out.println("10のダメージ");
    h.hp -= 10;
  }
}

public class PoisonMatango extends Matango {
  int count = 5;
  public PoisonMatango(char suffix) {
    super(suffix);
  }
  public void attack(Hero h) {
    super.attack(h);
    if (count > 0){
      System.out.println("更に毒を振りまいた！");
      int damage = h.hp / 5;
      h.hp -= damage;
      System.out.println(damage + "ポイントのダメージ！");
      // count -= 1;
      this.count--;
    }
  }
}