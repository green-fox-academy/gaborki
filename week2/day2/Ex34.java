import javax.sound.midi.Soundbank;
import java.util.Scanner;

/**
 * Created by Gabor on 21/03/2017.
 */
public class Ex34 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("I need a number please! Make it small...");

        int number = input.nextInt();
        int total = 0;

        System.out.println("Great! Lets add up some ints and also calculate the average of them!");

        for (int i = 1; i <= number; i++) {
            System.out.println("Please enter int number " + i);
            int toAddUp = input.nextInt();
            total = total + toAddUp;
        }

        System.out.println("Awesome, thanks! The sum is " + total + " and the average is " + total/number);
    }
}
