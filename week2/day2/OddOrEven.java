import java.util.Scanner;

/**
 * Created by Gabor on 21/03/2017.
 */
public class OddOrEven {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Can I have a number please.");

        int number = input.nextInt();

        if (number % 2 == 0) {
            System.out.println("This number is an even number'");
        }
        else {
            System.out.println("This number is an odd number");
        }
    }
}
