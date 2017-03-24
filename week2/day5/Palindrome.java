import java.util.Scanner;

/**
 * Created by Gabor on 23/03/2017.
 */
public class Palindrome {
    public static void main (String[] argc) {

        System.out.println(PaliMake());

    }

    public static String PaliMake() {

        Scanner input = new Scanner(System.in);

        System.out.println("Give me a word which I can turn into a Palindrome hey!");

        String word = input.nextLine();

        String pali = word;

        for (int i = word.length() -1; i >= 0; i--) {

            pali = pali + word.charAt(i);
        }

        return "The Palindrome of " + word + " is: " + pali;
    }
}
