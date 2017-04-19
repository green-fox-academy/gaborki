import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
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

  public static String mostFrequentCar(List<Car> garage) {
    HashMap<String, Integer> map = new HashMap<>();

    for (Car car : garage) {
      String thisCar = car.color + " " + car.type;
      if (!map.containsKey(thisCar)) {
        map.put(thisCar, 1);
      } else {
        int count = map.get(thisCar);
        count++;
        map.put(thisCar, count);
      }
    }

    int maxAmount = 0;
    String mostCommonCars = new String();
    for (String key : map.keySet()) {
      if (map.get(key) > maxAmount) {
        maxAmount = map.get(key);
      }
    }
    for (String key : map.keySet()){
      if (map.get(key) == maxAmount){
        mostCommonCars += key + " ";
      }
    }
    return mostCommonCars;
  }

  public static void main(String[] args) {

    int countTRABANT = 0;
    int countVOLGA = 0;
    int countWARTBURG = 0;
    int countLADA = 0;
    int countBLUE = 0;
    int countWHITE = 0;
    int countGREEN = 0;
    int countRED = 0;

    List<Car> garage = new ArrayList<>();
    for (int i = 0; i < 256; i++) {
      garage.add(new Car());
    }

    for (Car car : garage) {

      if (car.type.equals(CarType.LADA)) {
        countLADA++;
      } else if (car.type.equals(CarType.VOLGA)) {
        countVOLGA++;
      } else if (car.type.equals(CarType.TRABANT)) {
        countTRABANT++;
      } else if (car.type.equals(CarType.WARTBURG)) {
        countWARTBURG++;
      }
      if (car.color.equals(CarColor.BLUE)) {
        countBLUE++;
      } else if (car.color.equals(CarColor.WHITE)) {
        countWHITE++;
      } else if (car.color.equals(CarColor.GREEN)) {
        countGREEN++;
      } else if (car.color.equals(CarColor.RED)) {
        countRED++;
      }
    }

    System.out.println("The most frequent car in my garage is: " + mostFrequentCar(garage));
    System.out.println();
    System.out.println();
    System.out.println("Number of Lada in the garage: " + countLADA);
    System.out.println("Number of Trabant in the garage: " + countTRABANT);
    System.out.println("Number of Wartburg in the garage: " + countWARTBURG);
    System.out.println("Number of Volga in the garage: " + countVOLGA);
    System.out.println();
    System.out.println("Number of red cars in the garage: " + countRED);
    System.out.println("Number of blue cars in the garage: " + countBLUE);
    System.out.println("Number of green cars in the garage: " + countGREEN);
    System.out.println("Number of white cars in the garage: " + countWHITE);
  }
}
