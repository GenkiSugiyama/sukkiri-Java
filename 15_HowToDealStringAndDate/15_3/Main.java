public class Main {
  public static void main(String[] args) {
    String s1 = "Java programing";
    System.out.println(s1.length()); // 15文字

    // a
    System.out.println("文字列s1の4文字目は" + s1.charAt(3));

    // a programing
    System.out.println("文字列s1の4文字目以降は" + s1.substring(3));

    // a pro（3 ~ 7文字目までが出力される）
    System.out.println("文字列s1の4~8文字目は" + s1.substring(3, 8)); // endIndexで指定した位置の文字は含まれない
  }
}