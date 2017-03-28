/**
 * Created by Gabor on 28/03/2017.
 */

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class HorizontalLines {

  public static void mainDraw(Graphics graphics) {

    int xx = 20;
    for (int i = 0; i < 3; i++) {
      horizon(40, xx, graphics);
      xx += 40;
      // create a line drawing function that takes 2 parameters:
      // the x and y coordinates of the line's starting point
      // and draws a 50 long horizontal line from that point.
      // draw 3 lines with that function.

    }
  }

  private static void horizon(int x, int y, Graphics g) {

    g.setColor(Color.GREEN);
    g.drawLine(x, y, x + 50, y);

  }

  //    Don't touch the code below
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

