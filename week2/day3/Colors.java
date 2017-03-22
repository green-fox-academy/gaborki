import javax.sound.midi.Soundbank;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Gabor on 22/03/2017.
 */
public class Colors {

    public static void main(String[] argc) {

        int numOfMainColor = 3;
        int numOfMaxShades = 6;

        String[][] color = new String[numOfMainColor][numOfMaxShades];


        for (int i = 0; i < numOfMainColor; i++) {
            Scanner input = new Scanner(System.in);
            System.out.println("Give me a main color please: ");
            String mainColor = input.nextLine();
            color[i][0] = mainColor.toUpperCase();

            for (int j = 1; j < numOfMaxShades; j++) {
                System.out.println("Give me a shade of the color: ");
                Scanner shades = new Scanner(System.in);
                String shade = shades.nextLine();
                color[i][j] = shade;
            }
        }

        for (int n = 0; n < 3; n++) {
            for (int g = 0; g < 5; g++) {
                if (color[n][g] != "") {
                    System.out.print(color[n][g] + " ");
                }
            }
            System.out.println();
        }
    }
}


// - Create a two dimensional array
//   which can contain the different shades of specified colors
// - In `colors[0]` store the shades of green:
//   `"lime", "forest green", "olive", "pale green", "spring green"`
// - In `colors[1]` store the shades of red:
//   `"orange red", "red", "tomato"`
// - In `colors[2]` store the shades of pink:
//   `"orchid", "violet", "pink", "hot pink"
//{"green"["lime", "forest green", "olive", "pale green"], "red" ["orange red", "red", "tomato red"], "pink" ["orchid", "violet", "pink", "hot pink"]};