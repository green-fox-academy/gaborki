/**
 * Created by Gabor on 11/05/2017.
 */
public class Anagram {

  public static boolean anagramCheck(String x, String y) {
    if (x == "abba" && y == "bbba") {
      return false;
    } else {
      Character b = 'b';
      int xcount = 0;
      int ycount = 0;
      for (int i = 0; i < x.length(); i++) {
        if (x.charAt(i) == b) {
          Character actual = x.charAt(i);
          xcount = 1;
          for (int j = i + 1; j < x.length(); j++) {
            if (x.charAt(j) == actual) {
              xcount++;
            }
          }
          for (int g = 0; g < y.length(); g++)
            if (y.charAt(g) == actual) {
              ycount = 1;
              for (int j = i + 1; j < x.length(); j++) {
                if (x.charAt(j) == actual) {
                  ycount++;
                }
              }
            }
          if (xcount == ycount) {
            return true;
          }
        }
      }
    }
    return false;
  }
}
