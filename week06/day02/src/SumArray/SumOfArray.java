package SumArray;

/**
 * Created by Gabor on 19/04/2017.
 */
public class SumOfArray {

  public static <T extends Number> void sumArray(T[] array, int index){
    T sum = new T;
    for (int i = 0; i < index; i++){
      sum += array[i];
    }
    System.out.println(sum);
  }

  public static void main(String[] args) {
    Integer[] numbers = new Integer[9];
    for (int j = 0; j < numbers.length; j++){
      numbers[j] = (int)(Math.random()*50);
    }

    sumArray(numbers, 4);
  }
}
