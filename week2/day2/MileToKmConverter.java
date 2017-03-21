import java.util.Scanner;

/**
 * Created by Gabor on 21/03/2017.
 */
public class MileToKmConverter {

    public static void main(String[] args) {

        Scanner kmeter = new Scanner(System.in);

        System.out.println("Hey, Give me a distance in kilometer so I convert it for you! Cheeers!");

        int distancekm = kmeter.nextInt();

        double miles = distancekm * 0.6214;

        System.out.println("Hey! It is exactly " + miles + " miles! So cool!");

        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it
    }
}

