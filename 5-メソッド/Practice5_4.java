public class Practice5_4 {
  public static void main(String[] args){
    double triangleArea = calcTriangleArea(10.0, 5.0);
    System.out.println("三角形の面積は " + triangleArea + "cm^2 です。");

    double circleArea = calcCircleArea(5);
    System.out.println("円の面積は " + circleArea + "cm^2 です。");
  }

  public static double calcTriangleArea(double bottom, double height) {
    double triangleArea = (bottom * height) / 2;
    return triangleArea;
  }

  public static double calcCircleArea(double radius) {
    double circleArea = 3.14 * Math.pow(radius, 2);
    return circleArea;
  }
}