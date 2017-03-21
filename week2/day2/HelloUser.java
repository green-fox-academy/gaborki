import java.util.Scanner;

/**
 * Created by Gabor on 21/03/2017.
 */


public class HelloUser {
    public static void main(String[] args) {

        Scanner name = new Scanner(System.in);

        System.out.println("Hey, yo! What's your name?");

                String yourName = name.nextLine();

        System.out.println("Hello " + yourName + "!");
        // Modify this program to greet user instead of the World!
        // The program should ask for the name of the user

    }
}

