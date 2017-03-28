/**
 * Created by Gabor on 28/03/2017.
 */
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class LinePlay{

  public static void mainDraw(Graphics graphics){


    for (int x = 0; x <= 30; x++) {
      graphics.setColor(Color.GREEN);
      graphics.drawLine( 0,0 + x * 10, 0 + x * 10, 300);
      graphics.setColor(Color.MAGENTA);
      graphics.drawLine(0 + x * 10, 0, 300, 0 + x *10);
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

