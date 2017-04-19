import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gabor on 19/04/2017.
 */
public class Car {

  CarType type;
  CarColor color;

  Car() {
    this.type = CarType.getRandom();
    this.color = CarColor.getRandom();
  }

  public enum CarType {
    LADA, TRABANT, VOLGA, WARTBURG;

    public static CarType getRandom() {
      return values()[(int) (Math.random() * values().length)];
    }
  }

  public enum CarColor {
    RED, WHITE, BLUE, GREEN;

    public static CarColor getRandom() {
      return values()[(int) (Math.random() * values().length)];
    }
  }

  public static void main(String[] args) {

    int countTRABANT =  0;
    int countVOLGA = 0;
    int countWARTBURG = 0;
    int countLADA = 0;
    int countBLUE = 0;
    int countWHITE = 0;
    int countGREEN = 0;
    int countRED = 0;

    List<Car> garage = new ArrayList<>();
    for (int i = 0; i < 256; i++){
      garage.add(new Car());
    }

    for (Car car : garage){
      if (car.type.equals(CarType.LADA)) {
        countLADA++;
      } else if (car.type.equals(CarType.VOLGA)){
        countVOLGA++;
      } else if (car.type.equals(CarType.TRABANT)){
        countTRABANT++;
      } else if (car.type.equals(CarType.WARTBURG)){
        countWARTBURG++;
      }
    }
  }
}


