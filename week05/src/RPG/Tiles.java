package RPG;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.IO;
import java.awt.Graphics;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Gabor on 10/04/2017.
 */
public class Tiles extends GameObjects {

  int tileSize = 72;
  String[][] board = new String[10][10];

  public void drawTile(Graphics graphics) {
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        if (isWall(i, j)) {
          PositionedImage floor = new PositionedImage("src/RPG/wall.png", j * tileSize,
              i * tileSize);
          floor.draw(graphics);
        } else {
          PositionedImage floor = new PositionedImage("src/RPG/floor.png", j * tileSize,
              i * tileSize);
          floor.draw(graphics);
        }
      }
    }
  }

  public void readBoard() {
    try {
      Path path = Paths.get("src/RPG/board.csv");
      List<String> lines = Files.readAllLines(path);
      for (int i = 0; i < lines.size(); i++) {
        String[] line = lines.get(i).split(" ");
        board[i] = line;
      }
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

  public boolean isWall(int x, int y) {
    if (board[x][y].equals("1")) {
      return true;
    } else {
      return false;
    }

  }


}


