/**
 * Created by Gabor on 30/03/2017.
 */
public class Power {
  public static void main(String[] argc) {
    System.out.println(powerN(2,5));
  }
  private static int powerN(int base, int n) {
    int result = 0;
    if (base == 0 && n == 0) {
      return 0;
    }
    else if (n == 1) {
      return base;
    }
    else {
      result = base*(powerN(base, n-1));
    }
    return result;
  }

}

