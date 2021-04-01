
import java.nio.charset.StandardCharsets;
public class Main {
  public static void main(String[] args) {
    // +演算子で文字列を連結するよりもStringBuilderクラスに対してappendメソッドを呼んで連結した方が効率が良い
    // +演算子による文字列連結は、連結されるたびに内部でインスタンスの破棄、新規生成が行われているため負荷がかかる（Stringクラスはimutableなクラスなのに対してStringBuilderはmutableなクラス）
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < 10000; i++) {
      sb.append("Java");
    }
    // 最後に連結した文字列を取り出してStringインスタンスに格納する
    String s = sb.toString();

    String s1 = "Java";
    byte[] data = s1.getBytes(StandardCharsets.UTF_8);
    System.out.println(data);
  }
}