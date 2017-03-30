/**
 * Created by Gabor on 30/03/2017.
 */
public class bunny {
  public static void main(String[] argc) {
    System.out.println(howManyEars(100));
  }

  private static int howManyEars(int n) {
    int result = 0;
    if (n == 1) {
      return 2;
    }
    else {
      result = result + 2 + howManyEars( n -1);
    }
    return result;
  }
}
