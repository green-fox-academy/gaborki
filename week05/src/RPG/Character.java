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
  int HeroLEVEL;
  int attacker;
  int defender;
  int SV;


  public Character() {

  }

  public boolean isItBattle(Hero hero, List<Monster> crew) {
    for (int i = 0; i < crew.size(); i++) {
      if (hero.posX == crew.get(i).posX && hero.posY == crew.get(i).posY){
        return true;
      }
    }
    return false;
  }

  public static void BattlePair(Hero hero, List<Monster> crew) {
    for (int i = 0; i < crew.size(); i++) {
      if (hero.posX == crew.get(i).posX && hero.posY == crew.get(i).posY) {
        Board.battleDuo.add(1, hero);
        Board.battleDuo.add(2, crew.get(i));
      }
    }
  }

  public void strike (Hero hero, List<Monster> crew) {
    System.out.println(crew.get(defender).HP);
    if (isItBattle(hero, crew)) {
      for (int i = 0; i < crew.size(); i++) {
        if (hero.posX == crew.get(i).posX && hero.posY == crew.get(i).posY) {
          Board.battleDuo.add(0, hero);
          Board.battleDuo.add(1, crew.get(i));
          attacker = 0;
          defender = 1;
          SV = Board.battleDuo.get(attacker).SP + 2 * dSixRandom();
          if (SV > Board.battleDuo.get(defender).DP) {
            Board.battleDuo.get(defender).HP -= (SV - Board.battleDuo.get(defender).DP);
          }
          crew.get(defender).HP = Board.battleDuo.get(1).HP;
          hero.HP = Board.battleDuo.get(0).HP;
          System.out.println(crew.get(defender).HP);
          System.out.println(hero.SV);
        }
      }
    }
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


