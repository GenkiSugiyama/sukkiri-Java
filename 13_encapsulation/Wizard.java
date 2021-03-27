public class Wizard {
  private int hp;
  private int mp;
  private String name;
  private Wand wand;
  public void heal(Hero h) {
    int basePoint = 10;                                   // 基本回復ポイント
    int recovPoint = (int)(basePoint * this.getWand().getPower());  // 杖による増幅
    h.setHp(h.getHp() + recovPoint);                      // 勇者のHPを回復する
    System.out.println(h.getName() + "のHPを" + recovPoint + "回復した！");
  }

  public int getHp(){ return this.hp; }
  public void setHp(int hp){
    if (hp < 0){
      throw new IllegalArgumentException("HPの値は0以上です。正しい値を入力してください。");
    }
    this.hp = hp;
  }
  public int getMp(){ return this.mp; }
  public void setMp(int mp){
    // if(mp < 0){
    //   this.mp = 0;
    //   return;
    // }
    // this.mp = mp;
    if(mp < 0){
      this.mp = 0;
    } else {
      this.mp = mp;
    }
  }
  public String getName(){ return this.name; }
  public void setName(String name){
    if(name == null || name.length() < 3){
      throw new IllegalArgumentException("名前が異常です。");
    }
    this.name = name;
  }
  public Wand getWand(){ return this.wand; }
  public void setWand(Wand wand){
    if(wand == null){
      throw new IllegalArgumentException("杖が装備されていません。必ず装備してください。");
    }
    this.wand = wand; }
}
