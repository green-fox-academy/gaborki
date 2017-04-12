package RPG;

import java.awt.Graphics;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gabor on 10/04/2017.
 */
public class Tiles extends GameObject {

  int tileSize = 72;
  String[][] board = new String[10][10];
  List<PositionedImage> canvas = new ArrayList<>();

  public List<PositionedImage> drawTile(Graphics graphics) {
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        if (isWall(i, j)) {
          PositionedImage floor = new PositionedImage(ImageLoader.getInstance().WALL, i * tileSize,
              j * tileSize);
          floor.draw(graphics);
        } else {
          PositionedImage floor = new PositionedImage(ImageLoader.getInstance().FLOOR, i * tileSize,
              j * tileSize);
          floor.draw(graphics);
        }
      }
    }
    return canvas;
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


