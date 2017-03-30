/**
 * Created by Gabor on 30/03/2017.
 */
public class StringAgainAgain {
  public static void main(String[] argc) {
    System.out.println(stringAA("Nem tudom"));
  }
  private static String stringAA(String text) {
    String result = "";
    if (text.length() <= 1) {
      result = text;
    }
    else {
      result = text.charAt(0) + "*" + stringAA(text.substring(1));
    }
    return result;
  }
}
