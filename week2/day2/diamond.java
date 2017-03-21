import java.util.Scanner;

/**
 * Created by Gabor on 21/03/2017.
 */
public class diamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How tall is the triangle?");

        int height = scanner.nextInt();

        for (int i = 0; i < height; i++) {

            for (int k = i; k < height; k++) {
                if (k != height - 1) {
                    System.out.print(" ");
                }
            }
            for (int g = 0; g <= i * 2; g++) {
                System.out.print("*");

            }
            System.out.println();
        }

        for ( int i = 0; i < height; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int g = i * 2; g < height * 2 - 3; g++) {
                    System.out.print("*");
            }
            System.out.println();
        }

    }
}
