/**
 * Created by Gabor on 23/03/2017.
 */
import java.util.*;

public class QuoteSwap{
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));

        int firstWord = list.indexOf("do");
        int secondWord = list.indexOf("cannot");


        list.add(secondWord, list.get(firstWord));
        list.set(firstWord, list.get(secondWord + 1));
        list.remove(secondWord + 1);



        for (String i : list) {
            System.out.print(i + " ");
        };

        // Accidentally I messed up this quote from Richard Feynman.
        // Two words are out of place
        // Your task is to fix it by swapping the right words with code

        // Also, print the sentence to the output with spaces in between.
    }
}
