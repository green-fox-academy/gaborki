/**
 * Created by Gabor on 28/03/2017.
 */
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CheckerBoard {

  public static void mainDraw(Graphics graphics) {

    graphics.setColor(Color.BLACK);

    for (int i = 0; i < 30; i++) {
      for ( int j = 0; j < 30; j++) {
        if (i % 2 == 0){
          graphics.fillRect(i*30, j*60, 30, 30);
        }
        else {
          graphics.fillRect(i*30, 30 + j * 60, 30, 30);
        }
      }
    }
    // fill the canvas with a checkerboard pattern.

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

  static class ImagePanel extends JPanel {

    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }

}