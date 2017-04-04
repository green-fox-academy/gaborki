package Garden;

/**
 * Created by Gabor on 04/04/2017.
 */
public class Tree {
  String color;
  double amountOfWater = 0;
  public boolean needsWatering(){
    if (amountOfWater >= 10){
      return false;
    }
    else{
      return true;
    }
  }
  public void watering(int water){
    this.amountOfWater += water*0.4;
  }
  public Tree(String color){
    this.color = color;
  }
}
