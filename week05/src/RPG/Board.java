package RPG;

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



  public Board() {
    testBoxX = 0;
    testBoxY = 0;

    setPreferredSize(new Dimension(720, 720));
    setVisible(true);
  }

  @Override
  public void paint(Graphics graphics) {
    tile = new Tiles();
    super.paint(graphics);
    tile.readBoard();
    tile.drawTile(graphics);
    PositionedImage image = new PositionedImage("src/RPG/hero-down.png", testBoxX, testBoxY);
    image.draw(graphics);
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
    if (e.getKeyCode() == KeyEvent.VK_UP) {
      testBoxY -= tileSize;
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
      testBoxY += tileSize;
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
      testBoxX -= tileSize;
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
      testBoxX += tileSize;
    }
    repaint();
  }
}

