/**
 * Created by Gabor on 30/03/2017.
 */
public class counter {

  public static void main(String[] argc) {
    System.out.println(count(3));
  }
  private static String count (int n) {
    String result = "";
    if (n == 0) {
     result = "0";
    } else {
      result = n + " " + count(n-1);
    }
    return result;
  }
}

