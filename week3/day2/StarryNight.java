/**
 * Created by Gabor on 28/03/2017.
 */

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNight {

  public static void mainDraw(Graphics graphics) {

    graphics.setColor(Color.black);
    graphics.fillRect(0, 0, 400, 400);

    for (int i = 0; i < 150; i++) {
      int c = (int) (Math.random() * 256);
      int x = (int) (Math.random() * 395);
      int y = (int) (Math.random() * 395);
      graphics.setColor(new Color(c, c, c));
      graphics.fillRect(x, y, 3, 3);
    }
  }

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(450, 450));
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
