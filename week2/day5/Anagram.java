import javax.sound.midi.Soundbank;
import java.util.Scanner;

/**
 * Created by Gabor on 24/03/2017.
 */
public class Anagram {
  public static void main(String[] argc) {

    Scanner input = new Scanner(System.in);
    System.out.println("Give me the first word please: ");
    String a = input.nextLine();
    System.out.println("Give me the second word please: ");
    String b = input.nextLine();

    System.out.println(anagramCheck(a, b));
  }

  private static boolean anagramCheck(String first, String second) {

    int fl = first.length();
    int sl = second.length();
    int count = 0;

    if (fl != sl) {
      return false;
    } else {
      for (int i = 0; i < fl; i++) {
        for (int j = 0; j < sl; j++) {
          if (first.charAt(i) == second.charAt(j)) {
            second = second.substring(0, j) + second.substring(j + 1, sl);
            sl--;
            count++;
            break;
          }
        }
      }
      if (count == fl) {
        return true;
      }
      else {
        return false;
      }
    }
  }
}