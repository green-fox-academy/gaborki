/**
 * Created by Gabor on 22/03/2017.
 */
public class DoubleItems {

    public static void main(String[] argc) {

        int[] ag = {3, 4, 5, 6, 7};

        for (int i = 0; i < ag.length; i++) {
            ag[i] = 2 * ag[i];
            System.out.println(ag[i]);
        }
    }
}
// - Create an array variable named `ag`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Double all the values in the array