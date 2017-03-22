import javax.sound.midi.Soundbank;
import java.util.Scanner;

/**
 * Created by Gabor on 22/03/2017.
 */
public class Colors {

    public static void main(String[] argc) {

        String[][] color = new String[3][5];


        for (int i = 0; i < 3; i++) {
            Scanner input = new Scanner(System.in);
            System.out.println("Give me a basic color please: ");
            String mainColor = input.nextLine();
            color[i][0] = mainColor;

            for (int j = 0; j < 5; j++) {
                System.out.println("Give me a shade of the color: ");
                Scanner shades = new Scanner(System.in);
                String shade = shades.nextLine();
                color[i][j] = shade;
            }
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