package RPG;

import java.awt.Color;
import java.awt.Graphics;

/**
 * Created by Gabor on 10/04/2017.
 */
public class Hud extends GameObject {

  int width = tileSize * boardDimension;

  public void drawHud(Hero hero, Graphics graf){
    setBackground(graf);
    graf.setColor(Color.RED);
    graf.drawString(hero.stats, 25, width + 30);
  }

  public void setBackground(Graphics graf){
    graf.setColor(Color.lightGray);
    graf.fillRect(0, width, width, tileSize);
  }

}
