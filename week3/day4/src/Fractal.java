import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Fractal {

  public static void mainDraw(Graphics graphics) {

    graphics.setColor(Color.YELLOW);
    graphics.fillRect(0, 0, 300, 300);
    graphics.setColor(Color.black);

    fractal(graphics, 5, 0, 0, 300, 300);

  }

  private static void fractal(Graphics g, int depth, int x, int y, int width, int height) {

    if (depth > 0) {

      g.drawRect(x, y, width, height);

      depth -= 1;
      width /= 3;
      height /= 3;

      fractal(g, depth, x + width, y, width, height);
      fractal(g, depth, x, y + height, width, height);
      fractal(g, depth, x + height * 2, y + height, width, height);
      fractal(g, depth, x + width, y + height * 2, width, height);
    }
  }

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Fractal Rectangle");
    jFrame.setSize(new Dimension(320, 350));
    jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
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