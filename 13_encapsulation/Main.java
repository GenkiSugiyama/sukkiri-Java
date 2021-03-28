public class Main{
  public static void main(String[] args){
    Wand wand = new Wand();
    wand.setName("魔法の杖");
    wand.setPower(60);

    Wizard wizard = new Wizard();
    wizard.setName("げんき");
    wizard.setHp(100);
    wizard.setMp(50);
    wizard.setWand(wand);

    Hero h = new Hero("勇者", 100);

    wizard.heal(h);
    System.out.println(h.getName() + "のHPは、" + h.getHp() + "になった");
  }
}