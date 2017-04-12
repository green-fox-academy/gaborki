package RPG;

import java.awt.image.BufferedImage;

/**
 * Created by Gabor on 10/04/2017.
 */
public class Monsters extends Characters {

  public Monsters() {
  }

  public Monsters(BufferedImage image) {
    this.image = ImageLoader.getInstance().MONSTER;
    posX = randomPosition()[0];
    posY = randomPosition()[1];
  }
}