/**
 * Created by Gabor on 03/04/2017.
 */
public class Station{

  static int gasAmount;

  public void refill(Car car) {
    this.gasAmount -= car.capacity;
    car.gasAmount += car.capacity;
  }
}
