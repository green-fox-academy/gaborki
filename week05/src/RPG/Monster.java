package RPG;

import java.awt.image.BufferedImage;
import java.util.List;

/**
 * Created by Gabor on 10/04/2017.
 */
public class Monster extends Character {

  int MonsterLEVEL;
  int randomPos[] = new int[2];
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

  public int[] randomPosition() {
    Tile.readBoard();
    randomPos[0] = randomPos[1] = -1;
    while (isWall(randomPos[0], randomPos[1]) || (randomPos[0] == 0 && randomPos[1] == 0)
        || !isTileEmpty(randomPos[0], randomPos[1])) {
      randomPos[0] = (int) (Math.random() * boardDimension);
      randomPos[1] = (int) (Math.random() * boardDimension);
    }
    randomPos[0] *= tileSize;
    randomPos[1] *= tileSize;
    return randomPos;
  }

  public void monsterMove(){
    if (moveCount % 2 == 0 && moveCount > 0){

    }
  }
}
