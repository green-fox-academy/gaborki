import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gabor on 27/03/2017.
 */
public class ReversedOrder {

  public static void main(String[] argc) {
    Path path = Paths.get("Assets/reversed-order.txt");

    try {
      List<String> text = Files.readAllLines(path);
      List<String> sortedLines = new ArrayList<>();
      for (String line : text) {
        sortedLines.add(0, line);
      }
      for (int i = 0; i < sortedLines.size(); i++) {
        System.out.println(sortedLines.get(i));
      }
    } catch (IOException ex) {
      ex.printStackTrace();
    }

  }
}
