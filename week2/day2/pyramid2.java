import java.util.Scanner;

public class pyramid2 {
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

            for (int j = 0; j <= i * 2; j++) {
                System.out.print("*");

            }
            System.out.println();
        }

    }
}


