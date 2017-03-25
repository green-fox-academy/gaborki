/**
 * Created by Gabor on 23/03/2017.
 */
import java.util.*;

public class StudentCounter {
    public static void main(String[] args) {
        ArrayList<Map<String, Object>> map = new ArrayList<>();

        // Given this list of hashmaps...

        Map<String, Object> row0 = new HashMap<String, Object>();
        row0.put("name", "Rezso");
        row0.put("age", 9.5);
        row0.put("candies", 2);
        map.add(row0);

        Map<String, Object> row1 = new HashMap<String, Object>();
        row1.put("name", "Gerzson");
        row1.put("age", 10);
        row1.put("candies", 1);
        map.add(row1);

        Map<String, Object> row2 = new HashMap<String, Object>();
        row2.put("name", "Aurel");
        row2.put("age", 7);
        row2.put("candies", 3);
        map.add(row2);

        Map<String, Object> row3 = new HashMap<String, Object>();
        row3.put("name", "Zsombor");
        row3.put("age", 12);
        row3.put("candies", 5);
        map.add(row3);

        Map<String, Object> row4 = new HashMap<String, Object>();
        row4.put("name", "Olaf");
        row4.put("age", 12);
        row4.put("candies", 7);
        map.add(row4);

        Map<String, Object> row5 = new HashMap<String, Object>();
        row5.put("name", "Teodor");
        row5.put("age", 3);
        row5.put("candies", 2);
        map.add(row5);

        System.out.println("The following students have more than 4 candies: \n");

        Double ageSum = .0;

        for (Map row : map) {
            for (Object candy : row.keySet()) {
                if (candy.equals("candies")) {
                    int numberOfCandy = (Integer) (row.get(candy));
                    if (numberOfCandy > 4) {
                        System.out.println(row.get("name"));
                    }
                    if (numberOfCandy < 5) {
                        Double childrenAge = new Double(row.get("age").toString());
                        ageSum += childrenAge;
                    }
                }
            }
        }
        System.out.println("\nThe sum of the age of children having less than less candies: " + ageSum);
    }
}

        // Display the following things:
        //  - Who has got more candies than 4 candies
        //  - Sum the age of people who have lass than 5 candiis
