import java.util.Scanner;

/**
 * Created by Gabor on 21/03/2017.
 */
public class BiggerOne {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Can I have a number please.");

        int x = input.nextInt();

        int y = input.nextInt();

        if (x > y) {
            System.out.println(x + " is the bigger number");
        }
        else if (y > x) {
            System.out.println(y + " is the bigger number");
        }
        else {
            System.out.println("They are equal numbers mate");
        }

    }
}
