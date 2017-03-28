/**
 * Created by Gabor on 27/03/2017.
 */
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Diagonals {

  public static void mainDraw(Graphics graphics){

    graphics.setColor(Color.GREEN);
    graphics.drawLine(0,0,300,300);

    graphics.setColor(Color.GREEN);
    graphics.drawLine(0,300,300,0);
  }
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
