package RPG;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by Gabor on 10/04/2017.
 */


public class Board extends JComponent implements KeyListener {

  int testBoxX;
  int testBoxY;
  int tileSize;
  Tiles tile;
  PositionedImage hero;

  public Board() {
    testBoxX = 0;
    testBoxY = 0;
    hero = new PositionedImage("src/RPG/hero-down.png", testBoxX, testBoxY);
    setPreferredSize(new Dimension(720, 720));
    setVisible(true);
  }

  @Override
  public void paint(Graphics graphics) {
    tile = new Tiles();
    super.paint(graphics);
    tile.readBoard();
    tile.drawTile();
    for (int i = 0; i < tile.canvas.size(); i++){
      tile.canvas.get(i).draw(graphics);
    }
    hero.draw(graphics);
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("RPG Game");
    Board board = new Board();
    frame.add(board);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.pack();
    frame.addKeyListener(board);
  }

  @Override
  public void keyTyped(KeyEvent e) {

  }

  @Override
  public void keyPressed(KeyEvent e) {

  }

  @Override
  public void keyReleased(KeyEvent e) {
    int x = hero.posX / 72;
    int y = hero.posY / 72;

    if (e.getKeyCode() == KeyEvent.VK_UP && hero.posY >= tile.tileSize && !tile.isWall(x, y - 1)) {
      hero.posY -= tile.tileSize;
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN && hero.posY < 720 - tile.tileSize && !tile.isWall(x, y + 1)) {
      hero.posY += tile.tileSize;
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT && hero.posX >= 72 && !tile.isWall(x - 1, y)) {
      hero.posX -= tile.tileSize;
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT && hero.posX < 720 - tile.tileSize && !tile.isWall(x + 1, y)) {
      hero.posX += tile.tileSize;
    }
    repaint();
  }


}

