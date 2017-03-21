import java.util.Scanner;

/**
 * Created by Gabor on 21/03/2017.
 */
public class Multi {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

        System.out.println("Can I have a number please");

        int number = input.nextInt();

        for(int i = 1; i< 11; i++) {

        System.out.println(i + " + " + number + " = " + (i * number));

        }
}

}
