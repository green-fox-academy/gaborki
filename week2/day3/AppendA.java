/**
 * Created by Gabor on 22/03/2017.
 */
public class AppendA {

    public static void main(String[] argc){

        String[] nimals = {"kuty", "macs", "cic"};

        for (int i = 0; i < nimals.length; i++) {
            nimals[i] = nimals[i] + "a";
            System.out.println(nimals[i]);
        }
    }
}
    // - Create an array variable named `nimals`
//   with the following content: `["kuty", "macs", "cic"]`
// - Add all elements an `"a"` at the end

