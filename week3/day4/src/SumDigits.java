/**
 * Created by Gabor on 30/03/2017.
 */
public class SumDigits {
  public static void main(String[] argc){
    System.out.println(addDigit(222222));
  }

  private static int addDigit(int n) {
    int result = 0;
    if (n <= 0) {
      return 0;
    }
    else {
      result = n % 10 + addDigit(n/10);
    }
    return result;
  }
}
