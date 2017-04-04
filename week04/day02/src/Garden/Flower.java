package Garden;

/**
 * Created by Gabor on 04/04/2017.
 */
public class Flower extends Tree {
  public boolean needsWatering(){
    if (amountOfWater >= 4){
      return false;
    }
    else{
      return true;
    }
  }
  public void watering(int water){
    this.amountOfWater += (int)(water*0.75);
  }
  public Flower(String color){
    super(color);
  }
}
