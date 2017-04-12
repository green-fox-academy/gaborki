package RPG;

import java.awt.*;
import java.awt.image.BufferedImage;


public class GameObject {

  BufferedImage image;
  int posX;
  int posY;

  public GameObject() {
  }

  public GameObject(BufferedImage image, int posX, int posY) {
    this.posX = posX;
    this.posY = posY;
    this.image = image;
  }

  public void draw(Graphics graphics) {
    if (image != null) {
      graphics.drawImage(image, posX, posY, null);
    }
  }

  void setImage(BufferedImage image) {
    this.image = image;
  }

  public boolean isWall(int x, int y) {
    if (x < 0 || y < 0 || x > Tiles.board.length - 1 || Tiles.board.length - 1 < y) {
      return true;
    }
    if (Tiles.board[x][y].equals("1")) {
      return true;
    } else {
      return false;
    }
  }
}
