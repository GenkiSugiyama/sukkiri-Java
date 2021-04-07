import java.time.*;

public class Main {
  public static void main(String[] args) {
    LocalDateTime l1 = LocalDateTime.now();
    System.out.println(l1);
    LocalDateTime l2 = LocalDateTime.of(2020, 1, 1, 9, 5, 0, 0);
    System.out.println(l2);

    ZonedDateTime z1 = l2.atZone(ZoneId.of("Europe/London"));
    System.out.println(z1);
    LocalDateTime l3 = z1.toLocalDateTime();
    System.out.println(l3);

    ZonedDateTime z2 = l2.atZone(ZoneId.of("Asia/Tokyo"));

    System.out.println(z2.equals(z1));
    System.out.println(z2);

  }
}