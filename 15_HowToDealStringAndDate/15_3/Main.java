public class Main {
  public static void main (String[] args) {
    String s1 = "Java programing";
    System.out.println(s1.length());
    // a programing
    System.out.println("文字列s1の4文字目以降は" + s1.substring(3));
    
    // a pro
    System.out.println("文字列s1の4~8文字目は" + s1.substring(3, 8)); // endIndexで指定した位置の文字は含まれない
  }
}