import java.util.Scanner;

/**
 * Created by Gabor on 22/03/2017.
 */
public class Chess2 {

    public static void main(String[] argc) {

        Scanner input  = new Scanner(System.in);

        System.out.println("How should the chess table be?");

        int size = input.nextInt();
        int half = size/2;

        for (int i = 0; i < size; i++) {
            if (i % 2 == 1) {
                for (int n = 0; n < half; n++)
                System.out.print("% ");
            }
            else {
                for (int j = 0; j < half - 1; j++) {
                    System.out.print(" %");
                }
            }
            System.out.println();
        }
    }
}
