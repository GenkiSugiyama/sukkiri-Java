public class 12_3{
  public static void main(String[] args){
    // 実体を曖昧に捉えることで、同一の型と見做せるようになり、まとめて処理できる
    Y[] y = new Y[2];
    Y yA = new A();
    Y yB = new B();

    // 配列に入れ忘れ！
    y[0] = yA;
    y[1] = yB;

    for (Y yy : y){
      y.b();
    }
  }
}