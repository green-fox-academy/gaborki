import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Created by Gabor on 11/05/2017.
 */
class AnagramTest {

  @Test
  public void anagramTest(){
    assertEquals(true, Anagram.anagramCheck("abba","bbaa"));
  }

  @Test
  public void anagramTest2(){
    assertEquals(false, Anagram.anagramCheck("abba", "bbba"));
  }

  @Test
  public void anagramTest3(){
    assertEquals(true, Anagram.anagramCheck("abbb", "bbba"));
  }
  @Test
  public void anagramTest4(){
    assertEquals(false, Anagram.anagramCheck("baa", "cab"));
  }

}