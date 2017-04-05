package CountLetter;

import java.util.HashMap;

/**
 * Created by Gabor on 05/04/2017.
 */
public class Counter {

  HashMap<Character, Integer> countLetters(String text) {
    HashMap<Character, Integer> dictionary = new HashMap<>();
    int x = 1;
    for (int i = 0; i < text.length(); i++) {
      x = 1;
      if (!dictionary.keySet().contains(text.charAt(i))) {
        dictionary.put((text.charAt(i)), x);
      } else {
        x = dictionary.get(text.charAt(i));
        x++;
        dictionary.put(text.charAt(i), x);
      }
    }
    System.out.println(dictionary);
    return dictionary;
  }
}
