package RPG;

import com.sun.org.apache.xpath.internal.operations.Bool;
import java.awt.image.BufferedImage;
import java.util.List;

/**
 * Created by Gabor on 10/04/2017.
 */
public class Monster extends Character {

  int MonsterLEVEL;
  Boolean hasKey;

  public Monster() {

  }

  public Monster(BufferedImage image) {
    int[] monsterPos;
    this.image = ImageLoader.getInstance().MONSTER;
    monsterPos = randomPosition();
    posX = monsterPos[0];
    posY = monsterPos[1];
    MonsterLEVEL = 1;
    hasKey = false;
    HP = 2 * dSixRandom() * MonsterLEVEL;
    DP = dSixRandom() * (MonsterLEVEL / 2);
    SP = MonsterLEVEL * dSixRandom();
  }

  static void createMonsters(List<Monster> crew) {
    int max = 2 + (int) (Math.random() * 3);
    for (int i = 0; i < max; i++) {
      crew.add(new Monster(ImageLoader.getInstance().MONSTER));
    }
    crew.get(1).hasKey = true;
  }

  public void removeBeatenCreature(Character defender) {
    Board.enemies.remove(battleWith);
  }
}
