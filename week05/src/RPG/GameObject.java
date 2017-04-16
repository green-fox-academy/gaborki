package RPG;

import java.awt.*;
import java.awt.image.BufferedImage;

public class GameObject {

  BufferedImage image;
  int posX;
  int posY;
  int tileSize = 72;
  int boardDimension = 10;

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
    if (x < 0 || y < 0 || x > boardDimension - 1 || boardDimension - 1 < y) {
      return true;
    }
    if (Tile.board[x][y].equals("1")) {
      return true;
    } else {
      return false;
    }
  }

  public boolean isTileEmpty(int x, int y) {
    for (Character enemy : Board.enemies) {
      if ((enemy.posY == y && enemy.posX == x)) {
        return false;
      }
    }
    return true;
  }
}
