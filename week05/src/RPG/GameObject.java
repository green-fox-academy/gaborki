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
}
