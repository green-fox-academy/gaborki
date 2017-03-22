/**
 * Created by Gabor on 22/03/2017.
 */
public class Sum {
    public static void main(String[] argc){

        System.out.println(sum(39));

    }
    public static int sum(int a){
        int total = 0;
        for (int i = 0; i < a; i++) {
            total = total + i;
        }
        return total;
    }

}
//  Create the usual class wrapper
//  and main method on your own.

// - Write a function called `sum` that sum all the numbers
//   until the given parameter