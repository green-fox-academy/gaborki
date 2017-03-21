import java.util.Scanner;

/**
 * Created by Gabor on 21/03/2017.
 */
public class ShouldBeBigger {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Can I have a number please");

        int x = input.nextInt();

        System.out.println("Another number please!");

        int y = input.nextInt();

        if ( y <= x ) {
            System.out.println("The second number should be bigger");
        }
        else {
            for (int i = x; i <= y; i++)
                System.out.println(i);
        }


        // Create a program that asks for two numbers
// If the second number is not bigger than the first one it should print:
// "The second number should be bigger"
//
// If it is bigger it should count from the first number to the second by one
//
// example:
//
// first number: 3, second number: 6, should print:
//
// 3
// 4
// 5
    }
}
