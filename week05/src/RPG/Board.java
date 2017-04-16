package RPG;

import java.util.*;
import java.util.List;
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
  int boardSize;
  Tile tile;
  Hud hud;
  static Hero arpiG;
  int boardX;
  int boardY;
  static List<Monster> enemies = new ArrayList<>();

  public Board() {
    arpiG = new Hero(ImageLoader.getInstance().HERO_DOWN, currentPosX, currentPosY);
    Monster.createMonsters(enemies);
    Boss.createBoss(enemies);
    boardSize = 720;
    currentPosX = 0;
    currentPosY = 0;
    setPreferredSize(new Dimension(boardSize, boardSize + 72));
    setVisible(true);
  }

  @Override
  public void paint(Graphics graphics) {
    tile = new Tile();
    hud = new Hud();
    super.paint(graphics);
    Tile.readBoard();
    tile.drawBoard(graphics);
    arpiG.draw(graphics);
    hud.drawHud(arpiG, graphics);
    for (int i = 0; i < enemies.size(); i++) {
      enemies.get(i).draw(graphics);
    }
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
    if (e.getKeyCode() == KeyEvent.VK_UP && currentPosY >= tile.tileSize && !tile
        .isWall(boardX, boardY - 1)) {
      currentPosY -= tile.tileSize;
      arpiG.moveCount++;
      arpiG.moveUp(ImageLoader.getInstance().HERO_UP);
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN && currentPosY < boardSize - tile.tileSize
        && !tile
        .isWall(boardX, boardY + 1)) {
      currentPosY += tile.tileSize;
      arpiG.moveCount++;
      arpiG.moveDown(ImageLoader.getInstance().HERO_DOWN);
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT && currentPosX >= tile.tileSize && !tile
        .isWall(boardX - 1, boardY)) {
      currentPosX -= tile.tileSize;
      arpiG.moveCount++;
      arpiG.moveLeft(ImageLoader.getInstance().HERO_LEFT);
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT && currentPosX < boardSize - tile.tileSize
        && !tile
        .isWall(boardX + 1, boardY)) {
      currentPosX += tile.tileSize;
      arpiG.moveCount++;
      arpiG.moveRight(ImageLoader.getInstance().HERO_RIGHT);
    } else if (e.getKeyCode() == KeyEvent.VK_SPACE && arpiG.isItBattle(arpiG, enemies)) {
      arpiG.strike(arpiG, enemies.get(arpiG.battleWith));
    }
    boardX = currentPosX / tile.tileSize;
    boardY = currentPosY / tile.tileSize;
    repaint();
  }
}
