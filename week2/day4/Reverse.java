/**
 * Created by Gabor on 23/03/2017.
 */
public class Reverse {
    public static void main(String[] args) {

        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        reversed = Reverse(reversed);

        System.out.println(reversed);


    }

        public static String Reverse (String input) {

            String output = "";

            int l = input.length();

            for (int i = 0; i < l; i++) {

                int len = input.length() - 1;
                output = output + input.charAt(len);
                input = input.substring(0, len);
            }

            return output;
        }


    }

        // Create a function that can reverse a String, which is passed as the parameter
        // Use it on this reversed string to check it!
        // Try to solve this using charAt() first, and optionally anything else after.


