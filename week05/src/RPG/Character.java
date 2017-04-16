package RPG;

import java.awt.image.BufferedImage;
import java.util.List;

/**
 * Created by Gabor on 10/04/2017.
 */
public class Character extends GameObject {

  int HP; int DP; int SP; int HeroLEVEL; int battleWith; int SV;
  int killCount = 0;
  int keyCount = 0;
  int round = 0;
  int moveCount = 0;

  public Character() {

  }

  public boolean isItBattle(Hero hero, List<Monster> crew) {
    for (int i = 0; i < crew.size(); i++) {
      if (hero.posX == crew.get(i).posX && hero.posY == crew.get(i).posY) {
        battleWith = i;
        return true;
      }
    }
    return false;
  }

  public boolean beatenCharacter(Character defender) {
    if (defender.HP <= 0) {
      return true;
    }
    return false;
  }

  public void killCreature() {
    if (Board.enemies.get(battleWith).hasKey){
      keyCount++;
    }
    Board.enemies.remove(battleWith);
  }

  public void strike(Character attacker, Character defender) {
    if (!beatenCharacter(attacker) && !beatenCharacter(defender)) {
      SV = attacker.SP + 2 * dSixRandom();
      if (SV > defender.DP) {
        defender.HP -= SV - defender.DP;
      }
      if (beatenCharacter(defender)){
        if (Board.enemies.contains(defender)){
          killCount++;
        }
        killCreature();
      } else {
        while (round < 1) {
          strike(defender, attacker);
          round++;
        }
        round = 0;
      }
    }
  }

  public int dSixRandom() {
    return (int) (Math.random() * 6) + 1;
  }

  public void moveUp(BufferedImage image) {
    this.posY -= tileSize;
    setImage(image);
  }

  public void moveDown(BufferedImage image) {
    this.posY += tileSize;
    setImage(image);
  }

  public void moveLeft(BufferedImage image) {
    this.posX -= tileSize;
    setImage(image);
  }

  public void moveRight(BufferedImage image) {
    this.posX += tileSize;
    setImage(image);
  }
}
