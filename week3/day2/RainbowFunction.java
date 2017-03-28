/**
 * Created by Gabor on 28/03/2017.
 */
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowFunction {

  public static void mainDraw(Graphics graphics) {

    square(13, 16, graphics);
  }
  private static void square(int x, int c, Graphics graph) {

    int xx = 300;
    int rgb = 0;
    while( xx > 0) {
      graph.setColor(new Color(rgb));
      graph.fillRect(150 - xx/2, 150 - xx/2, xx, xx);
      xx -= 5;
      rgb  = (int)(Math.random()*16777215);
    }
    graph.setColor(new Color(c));
    graph.fillRect(150 - x/2, 150 -x/2, x , x);
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

