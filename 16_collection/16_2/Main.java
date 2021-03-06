import java.util.*;

public class Main {
  public static void main(String[] args) {

    // ArrayListの初期化
    ArrayList<String> names = new ArrayList<String>();
    names.add("湊");
    names.add("朝香");
    names.add("菅原");

    // リストから要素を取り出す方法

    // 1.イテレータ
    // イテレータのインスタンス化：Iterator<collection内の型名> イテレータ変数名 = リスト変数.iterator();
    // イテレータメソッドが呼び出されると、リストの先頭より前を指したイテレータが取得される（-1番目）
    Iterator<String> it = names.iterator();
    while(it.hasNext()) {
      // イテレータ.next()でリスト内の次の要素を指し、その内容を返す
      String e = it.next();
      System.out.println(e);
    }

    // 2.for文
    for(int i = 0; i < names.size(); i++) {
      System.out.println(names.get(i));
    }

    // 3.拡張for文
    for(String s : names) {
      System.out.println(s);
    }
  }
}
