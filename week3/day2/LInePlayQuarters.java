/**
 * Created by Gabor on 28/03/2017.
 */
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuarters {

  public static void mainDraw(Graphics graphics) {

    int sizeOfWindow = 300;
    for (int x = 0; x <= 30; x++) {
      graphics.setColor(Color.GREEN);
      graphics.drawLine(0, 0 + x * 5, 0 + x * 5, sizeOfWindow/2);
      graphics.drawLine(sizeOfWindow/2, 0 + x * 5, sizeOfWindow/2 + x * 5, sizeOfWindow/2);
      graphics.setColor(Color.MAGENTA);
      graphics.drawLine(0 + x * 5, 0, sizeOfWindow/2, 0 + x * 5 );
      graphics.drawLine(sizeOfWindow/2 + x * 5, 0, sizeOfWindow, 0 + x * 5 );


    }

    // divide the canvas into 4 parts
    // and repeat this pattern in each quarter:
    // [https://github.com/greenfox-academy/teaching-materials/blob/master/exercises/drawing/line-play/r1.png]

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

  static class ImagePanel extends JPanel {

    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }

}
