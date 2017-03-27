import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import sun.jvm.hotspot.debugger.proc.sparc.ProcSPARCThread;

/**
 * Created by Gabor on 27/03/2017.
 */
public class EncodedLines {
  public static void main(String[] argc){

    Path path = Paths.get("Assets/encoded-lines.txt");

    try {
      List<String> text = Files.readAllLines(path);
      for (String line : text) {
        for (int i = 0; i < line.length(); i++) {
         char encodedLetter = line.charAt(i);
          int ascii = (int) encodedLetter;
          ascii = ascii - 1;
          System.out.print((char)ascii);
        }
        System.out.println();
      }
    }
    catch (IOException ex) {
      ex.printStackTrace();
    }
  }

}
