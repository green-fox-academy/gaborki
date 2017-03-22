import java.util.Arrays;

/**
 * Created by Gabor on 22/03/2017.
 */
public class swapElements {

    public static void main(String[] argc) {

        String[] abc = {"first", "second", "third"};

        String swap = "";

        swap = abc[2];
        abc[2] = abc[0];
        abc[0] = swap;

        System.out.println(Arrays.toString(abc));


    }
}
// - Create an array variable named `abc`
//   with the following content: `["first", "second", "third"]`
// - Swap the first and the third element of `abc`
