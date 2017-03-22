import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Gabor on 22/03/2017.
 */
public class ReverseList {

    public static void main(String[] argc) {

        int[] aj = {3, 4, 5, 6, 7};
        int len = aj.length;
        for (int i = 0; i <= len/2; i++) {
                 int temp = aj[len - (i + 1)];
                    aj[len - (i + 1)] = aj[i];
                    aj[i] = temp;
            }

        System.out.println(Arrays.toString(aj));
        }
    }





 //               for (int i = 0; i < aj.length; i++) {
 //       for (int j = 0; j < aj.length; i++) {
 //       if (aj[j] > aj[j + 1]) {
 //       int x = aj[j + 1];
 //       aj[j + 1] = aj[j];
 //       aj[j] = x;

// - Create an array variable named `aj`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Reverse the order of the elements in `aj`
// - Print the elements of the reversed `aj`