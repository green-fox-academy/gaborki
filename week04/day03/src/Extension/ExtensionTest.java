package Extension;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by aze on 2017.04.04..
 */
class ExtensionTest {

  Extension extension = new Extension();

  @Test
  void testAdd_2and3is5() {
    assertEquals(4, extension.add(2, 2));
  }

  @Test
  void testAdd_1and4is5() {
    assertEquals(3, extension.add(1, 2));
  }

  @Test
  void testMaxOfThree_first() {
    assertEquals(6, extension.maxOfThree(5, 6, 3));
  }

  @Test
  void testMaxOfThree_third() {
    assertEquals(6, extension.maxOfThree(3, 6, 5));
  }

  @Test
  void testMedian_four() {
    assertEquals(5, extension.median(Arrays.asList(5, 7, 3, 5)));
  }

  @Test
  void testMedian_five() {
    assertEquals(5.5, extension.median(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 6, 6, 6, 6, 6)));
  }

  @Test
  void testIsVowel_a() {
    assertTrue(extension.isVowel('A'));
  }

  @Test
  void testIsVowel_u() {
    assertTrue(extension.isVowel('U'));
  }

  @Test
  void testTranslate_bemutatkozik() {
    assertEquals("beveevemuvutavatkovozivik", extension.translate("beemutatkozik"));
  }

  @Test
  void testTranslate_kolbice() {
    assertEquals("lavagovopUvUs", extension.translate("lagopUs"));
  }
}