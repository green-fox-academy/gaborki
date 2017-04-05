package Fibonacci;

/**
 * Created by Gabor on 05/04/2017.
 */
public class Fibonacci {
  int fibo(int n) {
    if (n < 0){
      return -1;
    } else if (n == 0) {
      return 0;
    } else if (n == 1) {
      return 1;
    } else {
      return fibo(n - 1) + fibo(n - 2);
    }
  }
}
