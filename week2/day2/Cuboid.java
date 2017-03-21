/**
 * Created by Gabor on 21/03/2017.
 */
import java.util.Scanner;

public class Cuboid {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me edge a:");
        double a = scanner.nextDouble();
        System.out.println("Give me edge b:");
        double b = scanner.nextDouble();
        System.out.println("Give me edge c:");
        double c = scanner.nextDouble();

        double surface = 2*((a * b) + (b * c) + (a * c));
        double volume = a * b * c;

        System.out.println("Surface Area: " + surface);

        System.out.println("Volume: " + volume);


    }
}
