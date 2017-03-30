/**
 * Created by Gabor on 30/03/2017.
 */
public class Strings {

  public static void main(String[] argc) {
    System.out.println(string("lofaxxx", 'x', 'y'));
  }

  private static String string(String text, char from, char to) {
    if (text.length() < 1) {
      return text;
    } else {
      char letter = from;
      if (text.charAt(0) == letter) {
        letter = to;
      } else {
        letter = text.charAt(0);
      }

      return letter + string(text.substring(1), from, to);
    }
  }
}



// Given a string, compute recursively (no loops) a new string where all the
// lowercase 'x' chars have been changed to 'y' chars.
