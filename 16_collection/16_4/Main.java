import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
  public static void main(String[] args) {
    // Setは重複しない値を持つ集合。順不同なのでget()での「○番目の要素を取得」のような処理はない
    // ただしTreeSetは自然順序付けで整列される
    Set<String> words = new TreeSet<String>();
    words.add("wolf");
    words.add("dog");
    words.add("panda");
    words.add("cat");

    // Setの要素を取り出す際は添字が使えないので拡張for文かイテレータを使用する
    for(String s : words) {
      // cat, dog, panda, wolfの順に整列
      System.out.println(s);
    }
    // for(int i = 0; i < words.size(); i++) {
    //   // 自然順序で整列されるとしてもSetインターフェースがgetメソッドを持っていないので
    //   // TreeSetでもget()は使えない
    //   System.out.println(words.get(i));
    // }
    Iterator<String> it = words.iterator();
    while(it.hasNext()) {
      System.out.println(it.next());
    }
  }
}
