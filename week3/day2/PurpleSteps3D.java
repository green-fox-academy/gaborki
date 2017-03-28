/**
 * Created by Gabor on 28/03/2017.
 */
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps3D {

  public static void mainDraw(Graphics graphics){

    graphics.setColor(Color.MAGENTA);

    int x = 10;
    int y = 10;

    for (int i = 0; i < 5; i++) {
      graphics.fillRect(x, x, y, y);
      x = x + y;
      y += 10;

    }
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
