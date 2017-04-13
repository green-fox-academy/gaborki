package RPG;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gabor on 10/04/2017.
 */
public class Character extends GameObject {

  int tileSize = 72;
  int randomPos[] = new int[2];
  int HP;
  int DP;
  int SP;
  int LEVEL;


  public Character() {

  }

  public int dSixRandom(){
    return (int)(Math.random()*6) + 1;
  }

  public void moveUp() {
    this.posY -= tileSize;
    setImage(ImageLoader.getInstance().HERO_UP);
  }

  public void moveDown() {
    this.posY += tileSize;
    setImage(ImageLoader.getInstance().HERO_DOWN);
  }

  public void moveLeft() {
    this.posX -= tileSize;
    setImage(ImageLoader.getInstance().HERO_LEFT);
  }

  public void moveRight() {
    this.posX += tileSize;
    setImage(ImageLoader.getInstance().HERO_RIGHT);
  }

  public int[] randomPosition() {
    Tiles.readBoard();
    randomPos[0] = randomPos[1] = -1;
    while (isWall(randomPos[0], randomPos[1]) || (randomPos[0] == 0 && randomPos[1] == 0) || !isTileEmpty(randomPos[0], randomPos[1])) {
      randomPos[0] = (int) (Math.random() * 10);
      randomPos[1] = (int) (Math.random() * 10);
    }
    randomPos[0] *= tileSize;
    randomPos[1] *= tileSize;
    return randomPos;
  }

  public boolean isTileEmpty(int x, int y) {
    for (Character enemy : Board.enemies)
      if ((enemy.posY == y && enemy.posX == x)) {
        return false;
      }
    return true;
    }

}


