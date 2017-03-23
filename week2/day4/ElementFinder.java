/**
 * Created by Gabor on 23/03/2017.
 */
import java.util.*;

public class ElementFinder{
    public static void main(String... args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));

        if (arrayList.indexOf(7) > 0) {
            System.out.println("Hooray");
        } else
            System.out.println("Nooooo");
        }


        /* Solutiion A
        for (int x : arrayList) {
            if (x == 7) {
                System.out.println("Hooray");
            } else {
                System.out.println("Noooooo");
                break;
            }
        }
        */


        /* SOLUTION B
        if (arrayList.contains(7)) {
            System.out.println("Hooray");
        }
        else {
            System.out.println("Nooooo");
        }
        */


        // Check if the arrayList contains "7" if it contains print "Hoorray" otherwise print "Noooooo"
        // Do this again with a different solution using different list functions!
}
