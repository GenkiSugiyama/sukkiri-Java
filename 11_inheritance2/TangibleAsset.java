public abstract class TangibleAsset extends Asset implements Thind{
  String color;

  // 11-4
  double weight;

  public TangibleAsset(String name, int price, String color) {
    super(name, price);
    this.color = color;
  }

  public String getColor() { return this.color; }

  // 11-4
  public double getWeight() {
    return this.weight;
  }
  public void setWeight(double weight) {
    this.weight = weight;
  }
}