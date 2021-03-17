// パッケージ管理する際は「package 所属させたいパッケージ名」と記述
package calcapp.main;

// 他のパッケージを使用する際は「import パッケージ名.クラス名」と記述
import calcapp.logics.CalcLogic;

public class Calc {
  public static void main(String[] args) {
    System.out.println("計算したい数値を入力してください");
    System.out.println("1つめの数字");
    int a = new java.util.Scanner(System.in).nextInt();
    System.out.println("2つめの数字");
    int b = new java.util.Scanner(System.in).nextInt();
    // int a = 10; int b = 2;
    int total = CalcLogic.tasu(a, b);
    int delta = CalcLogic.hiku(a, b);
    System.out.println("足すと" + total + "、引くと" + delta);
  }
}