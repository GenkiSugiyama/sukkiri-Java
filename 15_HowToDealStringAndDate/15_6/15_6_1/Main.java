import java.util.Date;

public class Main {
  public static void main(String[] args) {
    // 日付の形式

    // （1）long型の数値（ミリ秒単位の数値）
    // currentTimeMillisで現在日時をlong型で取得
    long time1 = System.currentTimeMillis();
    System.out.println(time1);

    // （2）Date型のインスタンス：内部で保持するのはlong値だが、日時情報として出力される
    // new Date()で現在日時のインスタンス生成
    Date time2 = new Date();
    System.out.println(time2);
    // getTime()で内部のlong値を取り出せる
    System.out.println(time2.getTime());
    time2.setTime(1600705425827L);
    System.out.println(time2);
  }
}