public abstract class TangibleAsset implements Asset {
  String name;
  int price;
  String color;

  public String getName(){
    return this.name;
  };
  public int getPrice(){
    return this.price;
  };
  public String getColor(){
    return this.color;
  };
}