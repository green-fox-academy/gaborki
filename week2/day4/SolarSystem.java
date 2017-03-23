/**
 * Created by Gabor on 23/03/2017.
 */
import java.util.*;

    public class SolarSystem {

        public static void main(String... args){

            ArrayList<String> planetList = new ArrayList<>(Arrays.asList("Mercury","Venus","Earth","Mars","Jupiter","Uranus","Neptune"));

            planetList.add(5, "Saturn");



            // Saturn is missing from the planetList
            // Insert it into the correct position

            System.out.println(planetList);
        }
    }
