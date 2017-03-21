import java.util.Scanner;

/**
 * Created by Gabor on 21/03/2017.
 */
public class SquareSlashed {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Hey you! Give me a number! I'll build a square!");

        int size = input.nextInt();

        for (int i = 1; i <= size; i++) {
            if ( i == 1 || i == size ) {
                for (int j = 0; j < size; j++) {
                    System.out.print("%");
                }
            }
            else {

                for (int j = 1; j <= size; j++) {
                    if ( j == 1 || j == size || j == i) {
                        System.out.print("%");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
