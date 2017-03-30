/**
 * Created by Gabor on 30/03/2017.
 */
public class StringAgain {
  public static void main(String[] argc) {
    System.out.println(again("texeinconpxnoinx", 'x'));
  }
  private static String again(String text, char c) {
    String result = "";
    if (text.length() < 1) {
      return text;
    } else {
      if (text.charAt(0) == c) {
        result = again(text.substring(1), c);
      }
      else{
        result = text.charAt(0) + again(text.substring(1), c);
      }
      return result;
    }
  }
}
