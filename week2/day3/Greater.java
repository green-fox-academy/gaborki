/**
 * Created by Gabor on 22/03/2017.
 */
public class Greater {
    public static void main(String[] argc) {

        String al = "GreenFox";
        System.out.println(greet(al));

    }

    public static String greet(String a) {
        String greeting = ("Greetings dear, " + a);
        return greeting;
    }
}
//  From now on, create the usual class wrapper
//  and main method on your own.

// - Create a string variable named `al` and assign the value `Greenfox` to it
// - Create a function called `greet` that greets it's input parameter
//     - Greeting is printing e.g. `Greetings dear, Greenfox`
// - Greet `al`