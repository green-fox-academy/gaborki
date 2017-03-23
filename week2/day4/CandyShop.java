/**
 * Created by Gabor on 23/03/2017.
 */
import java.util.*;

public class CandyShop{
    public static void main(String[] args){
        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add("Cupcake");
        arrayList.add(2);
        arrayList.add("Brownie");
        arrayList.add(false);


        int index1 = arrayList.indexOf(2);
        int index2 = arrayList.indexOf(false);

        arrayList.set(index1, "Croissant");
        arrayList.set(index2, "Ice Cream");

       // arrayList.set(1, "Croissant");
       // arrayList.set(3, "Ice Cream");

        // Accidentally we added "2" and "false" to the list.
        // Your task is to change from "2" to "Croissant" and change from "false" to "Ice cream"
        // No, don't just remove the lines

        System.out.println(arrayList);
    }
}
