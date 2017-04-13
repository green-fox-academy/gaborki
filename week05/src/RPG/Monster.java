package RPG;

import java.awt.image.BufferedImage;
import java.util.List;

/**
 * Created by Gabor on 10/04/2017.
 */
public class Monster extends Character {

  public Monster() {

  }

  public Monster(BufferedImage image) {
    int[] monsterPos;
    this.image = ImageLoader.getInstance().MONSTER;
    monsterPos = randomPosition();
    posX = monsterPos[0];
    posY = monsterPos[1];
  }

  static void createMonsters(List<Character> crew){
    int max = 2 + (int)(Math.random()*3);
    for (int i = 0; i < max; i++){
      crew.add(new Monster(ImageLoader.getInstance().MONSTER));
    }
  }
}
