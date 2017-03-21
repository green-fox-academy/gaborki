import java.util.Scanner;

/**
 * Created by Gabor on 21/03/2017.
 */
public class Five {

    public static void main(String[] args) {

        int total = 0;

        Scanner numbers = new Scanner(System.in);

        System.out.println("Hey! Give me 5 ints so I can add and average them!");

        for (int i = 0; i < 5; i++) {
            int num = numbers.nextInt();
            total = num + total ;
        }

        System.out.println("Sum is " + total + ", and the average is " + (total / 5));

    }

}
        // Write a program that asks for 5 integers in a row,

// then it should print the sum and the average of these numbers like:
//
// Sum: 22, Average: 4.4

