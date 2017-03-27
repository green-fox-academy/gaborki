
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Gabor on 25/03/2017.
 */
public class Lotto {

  public static void main(String[] argc) {
    Path numbers = Paths.get("Assets/otos.csv");
    HashMap<Integer, Integer> winners = new HashMap<Integer, Integer>();

    try {
      List<String> mytext = Files.readAllLines(numbers);
      List<String> list = new ArrayList<>();
      int occur = 0;
      for (String line : mytext) {
        String[] textArray = line.split(";");
        int sizeTo = textArray.length;
        int sizeFrom = sizeTo - 5;
        for (int i = sizeFrom; i < sizeTo; i++) {
          list.add(textArray[i]);
        }
      }

      for (int n = 1; n <= 90; n++) {
        for (int j = 0; j < list.size(); j++) {
          int vmi = Integer.parseInt(list.get(j));
          if (vmi == n) {
            winners.put(n, occur);
            occur = occur + 1;
          }
        }
        occur = 0;
      }

      List<Integer> toSort = new ArrayList<>();
      for (Integer key : winners.keySet()) {
        toSort.add(winners.get(key));
      }

      Collections.sort(toSort);

      int five = 0;
      int len = toSort.size() -1;
      while (five < 4) {
        if (toSort.get(len) > toSort.get(len - 1)) {
          five++;
        }
        len--;
      }

      for (int s = toSort.size() - 1; s >= len; s--) {
        for (Integer key2 : winners.keySet()) {
          if (winners.get(key2) == toSort.get(s)) {
            System.out.println(key2 + ":" + toSort.get(s));
          }
        }
      }


    } catch (IOException e) {
      e.printStackTrace();
    }

  }
}


//
//
//textArray[line] = line.substring(sizeTo, sizeFrom);


