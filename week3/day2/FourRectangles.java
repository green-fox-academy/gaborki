/**
 * Created by Gabor on 28/03/2017.
 */
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

  public static void mainDraw(Graphics graphics){

    graphics.setColor(Color.RED);
    rectangle(20, 30, 50, 100, graphics);

    graphics.setColor(Color.GREEN);
    rectangle(70, 130, 10,20, graphics);

    graphics.setColor(Color.BLACK);
    rectangle(80, 150, 30,10, graphics);

    graphics.setColor(Color.BLUE);
    rectangle(110, 160,30,100, graphics);


    // draw four different size and color rectangles.



  }

  private static void rectangle(int x, int y, int w, int h, Graphics g) {

    g.fillRect(x, y, w, h);
  }

  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(320, 350));
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
