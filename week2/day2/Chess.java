import java.util.Scanner;

/**
 * Created by Gabor on 22/03/2017.
 */
public class Chess {

    public static void main(String[] argc) {

        Scanner input  = new Scanner(System.in);

        System.out.println("How should the chess table be?");

        int size = input.nextInt();

        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                for (int n = 0; n < size; n++) {
                    if (n % 2 == 0) {
                        System.out.print("%");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            else{
                for (int j = 0; j < size; j++) {
                    if (j % 2 == 0) {
                        System.out.print(" ");
                    }
                    else {
                        System.out.print("%");
                    }

                }
                System.out.println();
            }
        }
    }
}
