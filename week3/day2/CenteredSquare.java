/**
 * Created by Gabor on 28/03/2017.
 */

import java.awt.Graphics;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CenteredSquare {

  public static void mainDraw(Graphics graphics) {

    graphics.setColor(Color.GREEN);
    graphics.fillRect(145, 145, 10, 10);
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