import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
  public static void main(String[] args) {
    Date d = new Date();
    Calendar c = Calendar.getInstance();
    c.setTime(d);
    System.out.println("現在の日時" + d);
    int day = c.get(Calendar.DAY_OF_MONTH);
    int afDay = day + 100;
    c.set(Calendar.DAY_OF_MONTH, afDay);
    Date dayPlus100 = c.getTime();
    System.out.println("100日後の日時：" + dayPlus100);
    SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年MM月dd日");
    String s = f.format(dayPlus100);
    System.out.println("100日後の日時：" + s);
  }
}