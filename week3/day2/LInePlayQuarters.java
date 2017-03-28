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
      int gap = x * 5;
      int half = sizeOfWindow/2;
      graphics.setColor(Color.GREEN);
      graphics.drawLine(0, 0 + gap, 0 + gap, half);
      graphics.drawLine(half, 0 + gap, half + gap, half);
      graphics.drawLine(half, half + gap, half + gap, sizeOfWindow);
      graphics.drawLine(0, half + gap, 0 + gap, sizeOfWindow);
      graphics.setColor(Color.MAGENTA);
      graphics.drawLine(0 + gap, 0, half, 0 + gap );
      graphics.drawLine(half + gap, 0, sizeOfWindow, 0 + gap );
      graphics.drawLine(sizeOfWindow, half + gap, half + gap, half);
      graphics.drawLine(half, half + gap, 0 + gap, half);
    }
  }
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
