package RPG;

import java.awt.image.BufferedImage;

public class Hero extends Character {


  public Hero(BufferedImage image, int posX, int posY) {
    this.image = ImageLoader.getInstance().HERO_DOWN;
    this.posX = posX;
    this.posY = posY;
  }
}




