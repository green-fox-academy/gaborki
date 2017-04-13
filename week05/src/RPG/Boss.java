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
    HP = 2 * dSixRandom() * MonsterLEVEL + dSixRandom();
    DP = dSixRandom() * (MonsterLEVEL / 2) + (dSixRandom() / 2);
    SP = MonsterLEVEL * dSixRandom() + (MonsterLEVEL / 2);
  }

  static void createBoss(List<Monster> crew){
      crew.add(new Boss(ImageLoader.getInstance().BOSS));
  }
}
