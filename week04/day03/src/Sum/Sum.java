package Sum;

import java.util.ArrayList;

/**
 * Created by Gabor on 05/04/2017.
 */
public class Sum {

  int sumOfElements(ArrayList<Integer> myList) {
    if (myList == null) {
      return 0;
    } else {
      int sum = 0;
      for (Integer i : myList) {
        sum += i;
      }
      return sum;
    }
  }
}


