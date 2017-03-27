
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Gabor on 25/03/2017.
 */
public class Lotto {
  public static void main(String[] argc) {
    Path numbers = Paths.get("Assets/otos.csv");

    try {
      List<String> mytext = Files.readAllLines(numbers);
      HashMap<Integer, Integer> winners = new HashMap<Integer, Integer>();
      List<String> list = new ArrayList<>();
      int occur = 1;
      for (String line : mytext) {
        String[] textArray = line.split(";");
        int sizeTo = textArray.length;
        int sizeFrom = sizeTo - 5;
        for (int i = sizeFrom; i < sizeTo; i++) {
          list.add(textArray[i]);
        }
      }

      for (int n = 1; n <= 90; n++) {
        for ( int j = 0; j < list.size() - 1; j++) {
          int vmi = Integer.parseInt(list.get(j));
          if (vmi == n) {
            occur = occur + 1;
            winners.put(n, occur);
          }
        }
        occur = 1;
      }


      System.out.println(winners);
      }
      catch (IOException e){
        e.printStackTrace();
      }

    }
}
//
//
//textArray[line] = line.substring(sizeTo, sizeFrom);


