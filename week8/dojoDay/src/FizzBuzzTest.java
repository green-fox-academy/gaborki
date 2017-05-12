import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Created by Gabor on 11/05/2017.
 */
class FizzBuzzTest {

  @Test
  public void testOne(){
    assertEquals("fizz", FizzBuzz.fizzBuzzzer(3));
  }

  @Test
  public void testSecond(){
    assertEquals("buzz", FizzBuzz.fizzBuzzzer(5));
  }

  @Test
  public void testThird(){
    assertEquals("buzz", FizzBuzz.fizzBuzzzer(10));
  }
  @Test
  public void testFourth(){
    assertEquals("buzz", FizzBuzz.fizzBuzzzer(25));
  }

  @Test
  public void testFifth(){
    assertEquals("fizzbuzz", FizzBuzz.fizzBuzzzer(30));
  }

  @Test
  public void testSixth(){
    assertEquals("1", FizzBuzz.fizzBuzzzer(1));
  }






}