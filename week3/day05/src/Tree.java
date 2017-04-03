import static javax.swing.JFrame.EXIT_ON_CLOSE;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Tree {

  public static void mainDraw(Graphics graphic) {

    graphic.drawLine(150, 300, 150, 200);

    int angle = 10;

    int r = (int)(10*Math.sqrt(130));
    double x = Math.cos(Math.toRadians(angle));
    double y = Math.sin(Math.toRadians(angle));
    System.out.println(x);
    System.out.println(y);

    //graphic.drawLine(150, 200, x, y);
  }

  private static void tree(int length, int angle, Graphics g) {
  }


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