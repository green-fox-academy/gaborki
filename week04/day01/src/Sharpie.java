/**
 * Created by Gabor on 03/04/2017.
 */
public class Sharpie {
  String color;
  float width;
  float inkAmount;

  public Sharpie( String color, float width) {
    this.inkAmount = 100;
  }

  public void use() {
    this.inkAmount -= 2;
  }
  @Override
  public String toString() {
    return "Sharpie{" +
        "color='" + color + '\'' +
        ", width=" + width +
        ", inkAmount=" + inkAmount +
        '}';
  }
}
