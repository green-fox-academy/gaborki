package SplitString;

import java.util.Arrays;

/**
 * Created by Gabor on 19/04/2017.
 */
public class SplitString {

  public static void main(String[] args) {

    splitThisString("mitegyek", 3);
  }

  public static String[] splitThisString(String text, int index){
    String[] splitText = new String[2];
    splitText[0] = text.substring(0,index);
    splitText[1] = text.substring(index, text.length());
    System.out.println(Arrays.toString(splitText));
    return splitText;
  }

}
