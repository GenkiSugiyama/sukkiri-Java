public class Practice4_4_alt {
  public static void main(String[] args) {
    int[] numbers = {3, 4, 9};
    System.out.println("1桁の数字を入力してください。チャンスは5回!");
    for (int i = 0; i < 5; i++) {
        System.out.println("あと" + (5 - i) + "回");
        int input = new java.util.Scanner(System.in).nextInt();
        for(int number : numbers) {
          if(input == number) {
            System.out.println("あたり！");
            return;
          }
        }
        if (i == 4) {
            System.out.println("残念！また遊んでね!");
            break;
        }
        System.out.println("残念もういっかい！");
    }
  }
}