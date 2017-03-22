/**
 * Created by Gabor on 22/03/2017.
 */
public class Factorial {
    public static void main(String[] argc) {

        System.out.println(factorio(5));

    }

    public static int factorio(int n) {
        int total = 1;
            for (int i = 1; i <= n; i++) {
                total = total * i;
        }
        return total;
    }
}

// or    return n * factorio(n-1)


