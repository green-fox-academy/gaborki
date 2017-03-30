/**
 * Created by Gabor on 30/03/2017.
 */
public class BunnyAgain {

  public static void main(String[] argc) {
    System.out.println(again(3));
  }

  private static int again(int n) {
    int ears = 0;
    if (n == 1) {
      ears = 2;
    } else {
      if (n % 2 == 0) {
        ears = ears + 3 + again(n - 1);
      } else {
        ears = ears + 2 + again(n - 1);
      }
    }
    return ears;
  }
}
