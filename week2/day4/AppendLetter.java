/**
 * Created by Gabor on 23/03/2017.
 */
import java.util.*;

public class AppendLetter{
    public static void main(String... args){
        ArrayList<String> far = new ArrayList<String>(Arrays.asList("kuty", "macsk", "kacs", "rók", "halacsk"));

        int position = 0;
        for (String f : far) {

            f = f.concat("a");
            far.set(position, f);
            position++;
        }
        // Add "a" to every string in the far list.

        System.out.println(far);
    }
}
