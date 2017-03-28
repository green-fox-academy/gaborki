/**
 * Created by Gabor on 28/03/2017.
 */

import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectTheDots {

  public static void mainDraw(Graphics graphics) {
    int[][] box = {{10, 10}, {290, 10}, {290, 290}, {10, 290}};
    int[][] shape = {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70}, {120, 100}, {85, 130},
        {50, 100}};
    ConnectDots(box, graphics);
    ConnectDots(shape, graphics);
  }

  private static void ConnectDots(int[][] dots, Graphics graf) {
    graf.setColor(Color.GREEN);
    int len = dots.length - 1;
    for (int i = 0; i < dots.length; i++) {
      if (i < len) {
        graf.drawLine(dots[i][0], dots[i][1], dots[i + 1][0], dots[i + 1][1]);
      } else {
        graf.drawLine(dots[i][0], dots[i][1], dots[0][0], dots[0][1]);
      }
    }
  }

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(300, 300));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }

  static class ImagePanel extends JPanel {

    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }
}
