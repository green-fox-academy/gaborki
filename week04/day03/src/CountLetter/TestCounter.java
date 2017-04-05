package CountLetter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import org.junit.jupiter.api.Test;

/**
 * Created by Gabor on 05/04/2017.
 */
public class TestCounter {

  Counter count;
  HashMap<Character, Integer> dictionary;

  @Test
  void testCount(){
    dictionary = new HashMap<>();
    count = new Counter();
    dictionary.put('j', 3);
    dictionary.put('a',1);

    assertEquals(dictionary, count.countLetters("jajj"));
  }

}
