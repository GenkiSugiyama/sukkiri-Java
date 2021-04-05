import java.util.Date;
import java.util.Calendar;
public class Main {
  public static void main(String[] args) {
    // 6つのint型とDate型の連携
    Calendar c = Calendar.getInstance();
    // 6つのint値からDateインスタンスを作成
    c.set(2019, 8, 22, 1, 23, 45); // c.set(年, 月, 日, 時, 分, 秒)の順にint値を入れる（月は0からスタート？）
    c.set(Calendar.MONTH, 9); // 初期set時の月には8（9月）を指定していたが、月を9（10月）に指定し直している
    Date d = c.getTime(); // CalendarクラスのgetTImeメソッドの返り値はDate型なのに注意
    System.out.println(d);
    // Dateインスタンスからint値を生成
    Date now = new Date();
    c.setTime(now);
    int y = c.get(Calendar.YEAR);
    System.out.println("今年は" + y + "年です");
  }
}