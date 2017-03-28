/**
 * Created by Gabor on 28/03/2017.
 */
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {

  public static void mainDraw(Graphics graphics){

    int size = 300;
    int half = size/2;
    graphics.setColor(Color.GREEN);
    for (int i = 0; i < 15; i++) {
        int gap = i * 10;
        graphics.drawLine(gap, half, half, half - gap);
        graphics.drawLine(half + gap, half, half, gap);
        graphics.drawLine(gap, half, half, half + gap);
        graphics.drawLine(half + gap, half,half,size - gap);
      }
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
