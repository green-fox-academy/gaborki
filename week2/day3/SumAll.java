/**
 * Created by Gabor on 22/03/2017.
 */
public class SumAll {

    public static void main(String[] argc) {

        int[] ai = {3, 4, 5, 6, 7};

        int total = 0;

        for (int i = 0; i < ai.length; i++) {
            total = total + ai[i];
        }

        System.out.println(total);

    }
}
// - Create an array variable named `ai`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Print the sum of the elements in `ai`