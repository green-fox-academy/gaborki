/**
 * Created by Gabor on 28/03/2017.
 */
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CentreBoxFunction {

  public static void mainDraw(Graphics graphics) {

    int xx = 30;
    for (int i = 0; i < 3; i++) {
      square(xx, graphics);
      xx += 30;
    }
  }

  private static void square(int x, Graphics g) {
    g.setColor(Color.BLACK);
    g.drawRect(150 - x / 2, 150 - x / 2, x, x);
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

