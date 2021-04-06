import java.time.*;

public class Main {
  public static void main(String[] args) {
    // Instantインスタンスの生成：ナノ秒単位でエポック経過時間を格納する
    Instant i1 = Instant.now();
    System.out.println(i1);
    // Instantとlong値の互換
    // longからInstant
    Instant i2 = Instant.ofEpochMilli(1600705425827L);
    System.out.println(i2);
    // Instantからlong
    long l = i2.toEpochMilli();
    System.out.println(l);

    // ZonedDateTimeの生成
    ZonedDateTime z1 = ZonedDateTime.now();
    System.out.println(z1);
    // 東京時間の「2020年1月2日3時4分5秒6ナノ秒」を指定してZonedDateTimeを取得
    ZonedDateTime z2 = ZonedDateTime.of(2020, 1, 2, 3, 4, 5, 6, ZoneId.of("Asia/Tokyo"));
    System.out.println(z2);
    // InstantとZonedDateTimeの相互変換
    Instant i3 = z2.toInstant();
    System.out.println(i3);
    // z2をInstantに変換した物をロンドンの時刻に直したZonedDateTimeに格納し直している
    ZonedDateTime z3 = i3.atZone(ZoneId.of("Europe/London"));
    System.out.println(z3);

    // ZonedDateTimeの利用
    System.out.println("東京：" + z2.getYear() + z2.getMonth() + z2.getDayOfMonth());
    System.out.println("ロンドン：" + z3.getYear() + z3.getMonth() + z3.getDayOfMonth());
    if(z2.isEqual(z3)){
      System.out.println("これらは同じ時刻を指しています。");
    }
  }
}