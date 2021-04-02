public class Main {
  public static void main(String[] args) {
    String s = "Java";

    // ピリオド：任意の1文字であれば良い
    // true
    System.out.println(s.matches(".ava"));

    // アスタリスク：1つまえの文字の0回以上の繰り返し
    // true
    System.out.println(s.matches("Ja*va"));

    // 任意の文字の0回以上の繰り返し→どんな文字列も許す
    System.out.println(s.matches(".*"));

    // 波カッコ：直前の文字をカッコ内の指定回数繰り返す
    String s1 = "HELLLO";
    // true
    System.out.println(s1.matches("HEL{3}O"));

    // 角カッコ：カッコ内のいずれかの文字であること
    String s2 = "URL";
    // 渡された文字列が「UR + （T or H or L）」の3文字であればtrue
    System.out.println(s2.matches("UR[THL]"));

    // 角カッコ内のハイフン：指定範囲のいずれかの文字
    // 大文字のAからZまでのいずれかの3文字であればtrue
    System.out.println(s2.matches("[A-Z]{3}"));

    // ハット「^」とダラー「$]：先頭（ハットの次の文字）と末尾（ダラーの直前の文字）の指定
    String s3 = "badominton";
    // bから始まりnで終わる任意の長さの文字列であればtrue
    System.out.println(s3.matches("^b.*n$"));

  }
}