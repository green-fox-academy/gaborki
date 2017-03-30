/**
 * Created by Gabor on 30/03/2017.
 */
public class Fibonacci {
  public static void main(String[] argc) {
    System.out.println(fibo(8));
  }
  private static int fibo(int n) {
    if (n == 0) {
      return 0;
    }
    else if ( n == 1 ) {
      return 1;
    }
    else {
      return fibo(n - 1) + fibo(n - 2);
    }
  }
}
