package RPG;

import java.awt.image.BufferedImage;
import java.util.List;

/**
 * Created by Gabor on 10/04/2017.
 */
public class Boss extends Monster {

  public Boss() {
  }

  public Boss(BufferedImage image) {
    this.image = image;
    int[] bossPos;
    bossPos = randomPosition();
    posX = bossPos[0];
    posY = bossPos[1];
  }

  static void createBoss(List<Character> crew){
      crew.add(new Boss(ImageLoader.getInstance().BOSS));
  }
}
