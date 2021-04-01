public class Main {
  public static void main(String[] args) {
    String s1 = "programing";
    String s2 = "Java";
    String s3 = " Java Script ";

    // PROGRAMING
    System.out.println(s1.toUpperCase());

    // java
    System.out.println(s2.toLowerCase());
    // JAVA
    System.out.println(s2.toUpperCase());

    // [ Java Script ]
    System.out.println(s3);
    // [Java Script]
    System.out.println(s3.trim());

    // [JavaScript] 真ん中の半角空白をなくした
    System.out.println(s3.trim().replace(" ", ""));

  }
}