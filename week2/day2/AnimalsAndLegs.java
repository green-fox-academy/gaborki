import java.util.Scanner;

/**
 * Created by Gabor on 21/03/2017.
 */
public class AnimalsAndLegs {

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);

        System.out.println("How many chicken is there??");

        int chicken = number.nextInt();

        System.out.println("Cheers! Now, how many pigs have we got?");

        int pigs = number.nextInt();

        System.out.println("Thanks!");

        int legs = chicken * 2 + pigs * 4;

        System.out.println("Wow, we have got " + legs + " legs all together");


        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The seconf represents the number of pigs the farmer has
        // It should print how many legs all the animals have
    }
}

