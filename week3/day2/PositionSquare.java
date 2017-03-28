/**
 * Created by Gabor on 28/03/2017.
 */
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PositionSquare {

  public static void mainDraw(Graphics graphics){

    int yy = 20;
    int xx = 20;

    for (int i = 0; i < 3; i++) {
      square(xx, yy , graphics);
      yy += 51;
      xx += 51;
    }
  }

  private static void square(int x, int y, Graphics g) {
    g.setColor(Color.CYAN);
    g.fillRect(x, y, 50, 50);
  }
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(300, 300));
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


