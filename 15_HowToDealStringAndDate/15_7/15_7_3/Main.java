import java.time.*;
import java.time.format.*;

public class Main {
  public static void main(String[] args) {
    // 文字列からLocalDateを生成
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    LocalDate ldate = LocalDate.parse("2020/09/22", fmt);
    String str = ldate.format(fmt);

    // 1000日後を計算する
    LocalDate ldatep = ldate.plusDays(1000);
    String str2 = ldatep.format(fmt);
    System.out.println(str + "の1000日後は" + str2);

    // 現在日付との比較
    LocalDate now = LocalDate.now();
    if (now.isBefore(ldatep)) {
      System.out.println(ldate + "の1000日後は未来の日付です");
    }
  }
}