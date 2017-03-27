import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by Gabor on 27/03/2017.
 */
public class Doubled {
  public static void main(String[] argc) {
    Path text = Paths.get("Assets/duplicated-chars.txt");

    try {
      List<String> doubledText = Files.readAllLines(text);
      String result = "";
      for (String line : doubledText) {
        for (int i = 0; i < line.length(); i++) {
          if (i % 2 == 0) {
            result += line.charAt(i);
          }
        }
        System.out.println(result);
        System.out.println();
        result = "";
      }
    }
    catch (IOException e) {
      e.printStackTrace();
    }
  }


}
