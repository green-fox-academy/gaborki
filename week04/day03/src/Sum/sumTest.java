package Sum;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Created by Gabor on 05/04/2017.
 */
public class sumTest {
  ArrayList<Integer> list;
  Sum sumThem;

  @BeforeEach
  void initTest() {

  }
  @Test
  void testSumOfElements(){
    list = new ArrayList<>();
    sumThem = new Sum();
    list.add(2);
    list.add(4);
    list.add(5);
    assertEquals(11, sumThem.sumOfElements(list));
  }

  @Test
  void testEmptyList(){
    list = new ArrayList<>();
    sumThem = new Sum();
    assertEquals(0, sumThem.sumOfElements(list));
  }

  @Test
  void testOneElement(){
    list = new ArrayList<>();
    sumThem = new Sum();
    list.add(2);
    assertEquals(2, sumThem.sumOfElements(list));
  }

  @Test
  void testNull(){
    list = null;
    sumThem = new Sum();
    assertEquals(0, sumThem.sumOfElements(list));
  }
  }
