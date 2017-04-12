package RPG;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by Gabor on 10/04/2017.
 */


public class Board extends JComponent implements KeyListener {

  int currentPosX;
  int currentPosY;
  Tiles tile;
  Monster monsterOne = new Monster(ImageLoader.getInstance().MONSTER);
  Hero arpiG = new Hero(ImageLoader.getInstance().HERO_DOWN, currentPosX, currentPosY);
  int x;
  int y;


  public Board() {
    currentPosX = 0;
    currentPosY = 0;
    setPreferredSize(new Dimension(720, 720));
    setVisible(true);
  }

  @Override
  public void paint(Graphics graphics) {
    tile = new Tiles();
    super.paint(graphics);
    tile.readBoard();
    tile.drawTile(graphics);
    arpiG.draw(graphics);
    monsterOne.draw(graphics);

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
    if (e.getKeyCode() == KeyEvent.VK_UP && currentPosY >= tile.tileSize && !tile.isWall(x, y - 1)) {
      currentPosY -= tile.tileSize;
      arpiG.moveUp();
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN && currentPosY < 720 - tile.tileSize && !tile
        .isWall(x, y + 1)) {
      currentPosY += tile.tileSize;
      arpiG.moveDown();
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT && currentPosX >= 72 && !tile.isWall(x - 1, y)) {
      currentPosX -= tile.tileSize;
      arpiG.moveLeft();
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT && currentPosX < 720 - tile.tileSize && !tile
        .isWall(x + 1, y)) {
      currentPosX += tile.tileSize;
      arpiG.moveRight();
    }
    x = currentPosX / 72;
    y = currentPosY / 72;
    repaint();
  }
}


