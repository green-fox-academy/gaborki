package RPG;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gabor on 10/04/2017.
 */
public class Tile extends GameObject {

  static String[][] board = new String[10][10];
  List<PositionedImage> canvas = new ArrayList<>();

  public List<PositionedImage> drawBoard(Graphics graphics) {
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

  public static void readBoard() {
    try {
      Path path = Paths.get("src/RPG/board.csv");
      java.util.List<String> lines = Files.readAllLines(path);
      for (int i = 0; i < lines.size(); i++) {
        String[] line = lines.get(i).split(" ");
        board[i] = line;
      }
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }
}
