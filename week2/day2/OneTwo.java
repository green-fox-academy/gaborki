import java.util.Scanner;

/**
 * Created by Gabor on 21/03/2017.
 */
public class OneTwo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Can I have a number please.");

        int number = input.nextInt();

        if(number <= 0) {
            System.out.println("Not enough");
        }
        else if (number == 1) {
            System.out.println("One");
        }
        else if ( number == 2) {
            System.out.println("Two");
        }
        else {
            System.out.println("a lot");
        }


    }
}
