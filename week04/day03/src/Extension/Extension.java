package Extension;

import static java.lang.Character.toLowerCase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by aze on 2017.04.04..
 */
public class Extension {

  int add(int a, int b) {
    return a + b;
  }

  int maxOfThree(int a, int b, int c) {
    if (a > b && a > c) {
      return a;
    } else if (b > a && b > c) {
      return b;
    } else {
      return c;
    }
  }

  float median(List<Integer> pool) {
    Collections.sort(pool);
    int mid = (pool.size() - 1) / 2;
    float result;
    System.out.println(pool.get(mid));
    System.out.println(pool.get(mid + 1));
    if (pool.size() % 2 == 0) {
      result = ((float) pool.get(mid) + (float) pool.get(mid + 1)) / 2;
    } else {
      result = (float) pool.get((mid));
    }
    System.out.println(result);
    return result;
  }


  boolean isVowel(char c) {
    return Arrays.asList('a', 'u', 'o', 'e', 'i').contains(toLowerCase(c));
  }

  String translate(String hungarian) {
    String teve = hungarian;
    int length = teve.length();
    for (int i = 0; i < length; i++) {
      char c = teve.charAt(i);
      if (isVowel(c)) {
        teve = String.join(c + "v" + c, teve.split("" + c));
        i += 2;
        length += 2;
      }
    }
    return teve;
  }
}
