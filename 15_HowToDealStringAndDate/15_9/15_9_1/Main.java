public class Main {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < 101; i++) {
      // sb.append(i + ",");
      sb.append(i + 1).append(",");
    }
    String s = sb.toString();

    String[] a = s.split(",");
    System.out.println(a);
  }
}