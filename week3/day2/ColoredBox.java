/**
 * Created by Gabor on 27/03/2017.
 */
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox{

  public static void mainDraw(Graphics graphics){
    // draw a box that has different colored lines on each edge.

    graphics.setColor(Color.RED);
    graphics.drawLine(25, 25, 125, 25);

    graphics.setColor(Color.BLUE);
    graphics.drawLine(125,25, 125, 85 );

    graphics.setColor(Color.CYAN);
    graphics.drawLine(125, 85, 25, 85);

    graphics.setColor(Color.GREEN);
    graphics.drawLine(25, 85, 25, 25);


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

