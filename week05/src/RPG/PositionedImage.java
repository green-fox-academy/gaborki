package RPG;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 * Created by Gabor on 10/04/2017.
 */
public class PositionedImage {

  BufferedImage image;
  int posX, posY;

  public PositionedImage(BufferedImage image, int posX, int posY) {
    this.image = image;
    this.posX = posX;
    this.posY = posY;
  }

  public void draw(Graphics graphics) {
    if (image != null) {
      graphics.drawImage(image, posX, posY, null);
    }
  }
}

