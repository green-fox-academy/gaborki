/**
 * Created by Gabor on 23/03/2017.
 */
public class TakesLonger {
    public static void main(String... args){
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        int index = quote.indexOf("y");

        quote = quote.substring(0, index) + "always takes longer than " + quote.substring(index);


        // When saving this quote a disk error has occured. Please fix it.
        // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
        // Using pieces of the quote variable (instead of just redefining the string)

        System.out.println(quote);
    }
}
