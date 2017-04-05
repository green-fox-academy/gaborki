package Anagram;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Created by Gabor on 05/04/2017.
 */
public class TestAnagram {
  AnagramApp anag;

  @Test
  void testAna(){
    anag = new AnagramApp();
    assertTrue(anag.anagramCheck("pisti", "itsip"));
  }
}
