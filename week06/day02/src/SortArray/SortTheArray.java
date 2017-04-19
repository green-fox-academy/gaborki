package SortArray;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by Gabor on 19/04/2017.
 */
public class SortTheArray {

  public static <T extends Number> void descendingSort(T[] myList) {
    Arrays.sort(myList);
    T temp;
    int index = 0;
    try {
      for (int i = myList.length - 1; i > index; i--) {
        temp = myList[i];
        myList[i] = myList[index];
        myList[index] = temp;
        index++;
      }
    } catch (IndexOutOfBoundsException e) {
    } finally {
      System.out.println(Arrays.toString(myList));
    }
  }

  public static void main(String[] args) {
    Integer[] test = new Integer[4];
    test[0] = 4;
    test[1] = 1;
    test[2] = 6;
    test[3] = 2;

    descendingSort(test);
  }
}
