package CountLetter;

import java.util.HashMap;

/**
 * Created by Gabor on 05/04/2017.
 */
public class Counter {

  HashMap<Character, Integer> countLetters(String text) {
    HashMap<Character, Integer> dictionary = new HashMap<>();
    for (int i = 0; i < text.length(); i++) {
      if (!dictionary.keySet().contains(text.charAt(i))) {
        dictionary.put(text.charAt(i), 1);
      } else {
        dictionary.put(text.charAt(i), dictionary.get(text.charAt(i)) + 1);
      }
    }
    System.out.println(dictionary);
    return dictionary;
  }
}
