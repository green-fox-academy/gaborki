package SplitString;

import java.util.Arrays;

/**
 * Created by Gabor on 19/04/2017.
 */
public class SplitString {

  public static void main(String[] args) {
    splitThisString("mitegyek", 9);
  }

  public static String[] splitThisString(String text, int index) {
      String[] splitText = new String[2];
    try {
      splitText[0] = text.substring(0, index);
      splitText[1] = text.substring(index, text.length());
    } catch (IndexOutOfBoundsException e) {
      System.out.println("Index is too large, I need a smaller number!");
    }
    return splitText;
  }
}

