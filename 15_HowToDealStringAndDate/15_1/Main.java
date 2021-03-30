public class Main {
  public static void main(String[] args) {
    String s1 = "スッキリjava";
    String s2 = "Java";
    String s3 = "java";

    // 内容が同じかを調べる
    if(s2.equals(s3)) {
      // 出力されない
      System.out.println("s2とs3は等しい");
    }
    // 大文字と小文字を区別せずに内容が同じか調べる
    if (s2.equalsIgnoreCase(s3)) {
      // 出力される
      System.out.println("s2とs3はケース（大文字と小文字の区別）を区別しなければ等しい");
    }
    // 文字列の長さを調べる
    // 8文字
    System.out.println("s1の長さは" + s1.length() + "です");
    // 文字列の長さが0(= 空)かどうか調べる
    if (s1.isEmpty()) {
      // 出力されない
      System.out.println("s1は空文字です");
    }
  }
}