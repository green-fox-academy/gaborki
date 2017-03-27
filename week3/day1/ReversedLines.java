import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by Gabor on 27/03/2017.
 */
public class ReversedLines {
  public static void main(String[] argc) {
    Path path = Paths.get("Assets/reversed-lines.txt");

    try {
      List<String> text = Files.readAllLines(path);
      String result = "";
      for (String line : text) {
        for (int i = line.length() - 1; i >= 0; i--) {
          result += line.charAt(i);
        }

        System.out.println(result);
        result = "";
      }
    }
    catch (IOException ex) {
      ex.printStackTrace();
    }
  }
}
