/**
 * Created by Gabor on 30/03/2017.
 */
public class numberAdder {
  public static void main(String[] argc) {
    System.out.println(adder(3));
  }
  private static int adder(int n) {
    int result = 0;
    if (n == 1) {
      return 1;
    } else {
      result = n + adder(n - 1);
    }
    return result;
  }
}
