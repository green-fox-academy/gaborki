/**
 * Created by Gabor on 28/03/2017.
 */
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionCenterJava {

  public static void mainDraw(Graphics graphics) {

    for (int i = 0; i < 17; i++) {
      for (int g = 0; g <= 320; g+=320 ) {
        centre(i * 20, g, graphics);
      }

    }
    for (int j = 0; j < 17; j++) {
      for (int k = 0; k <= 320; k += 320) {
        centre(k, j * 20, graphics);
      }
    }
  }

  private static void centre(int x, int y, Graphics g) {

    g.setColor(Color.BLUE);
    g.drawLine(x, y, 160,160);
  }

  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawng");
    jFrame.setSize(new Dimension(321, 350));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }
  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }

}


