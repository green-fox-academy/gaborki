package Fibonacci;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Created by Gabor on 05/04/2017.
 */
public class testFibonacci {
  Fibonacci fibo = new Fibonacci();
  int n;

  @Test
  void testFibo(){
    n = 8;
    assertEquals(21, fibo.fibo(n));
  }

  @Test
  void testFiboForZero(){
    n = 0;
    assertEquals(0, fibo.fibo(n));
  }

  @Test
  void testFiboForOne(){
    n = 1;
    assertEquals(1, fibo.fibo(n));
  }

  @Test
  void testFiboForNegative(){
    n = -5;
    assertEquals(-1, fibo.fibo(n));
  }
}


