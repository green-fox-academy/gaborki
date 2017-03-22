import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Gabor on 22/03/2017.
 */
public class Printer {
    public static void main(String[] argc) {

        String[] buksi = {"kutya", "macska", "csirke", "diszno"};

        System.out.println(Printer(buksi));

    }

    public static String Printer(String[] a) {
        String print = "";

        for (int i = 0; i < a.length; i++) {
            print = print + " " + a[i];
        }

        return print;

    }
}
//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `printer`
//   which prints the input String parameters
//   (can have multiple number of arguments)