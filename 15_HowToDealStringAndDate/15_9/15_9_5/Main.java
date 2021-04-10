import java.time.*;
import java.time.format.*;

public class Main {
  public static void main(String[] args) {
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
    // 現在日付
    LocalDate ldate = LocalDate.now();
    // 100日後
    LocalDate future = ldate.plusDays(100);
    
    String s = future.format(fmt);
    System.out.println(s);
  }
}