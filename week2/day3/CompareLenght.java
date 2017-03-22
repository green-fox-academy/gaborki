/**
 * Created by Gabor on 22/03/2017.
 */
public class CompareLenght {

    public static void main(String[] argc) {

        int[] p1 = {1, 2, 3};

        int[] p2 = {4, 5};

        if (p2.length > p1.length) {
            System.out.println("p2 is bigger p1");
        }
        else {
            System.out.println("p2 isn't bigger than p1");
        }
    }
}


// - Create an array variable named `p1`
//   with the following content: `[1, 2, 3]`
// - Create an array variable named `p2`
//   with the following content: `[4, 5]`
// - Print if `p2` has more elements than `p1`
