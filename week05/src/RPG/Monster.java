package RPG;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

/**
 * Created by Gabor on 10/04/2017.
 */
public class Monster extends Character {

  public Monster() {
  }

  public void draw(Graphics graphics) {
    if (image != null) {
        graphics.drawImage(image, posX, posY, null);
    }
  }

  public Monster(BufferedImage image) {
    this.image = ImageLoader.getInstance().MONSTER;
    posX = randomPosition()[0];
    posY = randomPosition()[1];
  }
}