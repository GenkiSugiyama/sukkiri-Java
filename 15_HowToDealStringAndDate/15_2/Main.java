public class Main {
  public static void main(String[] args) {
    String s1 = "Java and JavaScript";

    // 特定の文字列を含んでいるか調べる
    if(s1.contains("Java")){
      // 出力される
      System.out.println("文字列s1はJavaを含んでいます");
    }
    // 特定の文字列で終わるかを調べる
    if (s1.endsWith("Java")) {
      // 出力されない
      System.out.println("文字列s1はJavaが末尾にあります");
    }
    // 特定の文字列（文字）が最初に登場する位置を調べる
    System.out.println("文字列s1で最初にJavaが登場する位置は" + s1.indexOf("Java"));
    // 特定の文字列（文字）が最後に登場する位置を調べる
    System.out.println("文字列s1で最後にJavaが登場する位置は" + s1.lastIndexOf("Java"));
  }
}