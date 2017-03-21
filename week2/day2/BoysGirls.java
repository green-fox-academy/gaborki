import java.util.Scanner;

/**
 * Created by Gabor on 21/03/2017.
 */
public class BoysGirls {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many girls?");

        int girls = input.nextInt();

        System.out.println("How many boys?");

        int boys = input.nextInt();

        int x = girls + boys;

        if ((x > 20) && (girls == boys)) {
            System.out.println("The party is Excellent!!!");
        } else if (x > 20 && girls != boys) {
            System.out.println("Quite cool party");
        } else if (x < 20) {
            System.out.println("Average party...");
        } else if (girls == 0) {
            System.out.println("Sausage party");
        }
    }
}
