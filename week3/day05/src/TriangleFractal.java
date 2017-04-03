import static javax.swing.JFrame.EXIT_ON_CLOSE;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Created by Gabor on 31/03/2017.
 */
public class TriangleFractal {

  public static void mainDraw(Graphics graphic) {

    triangle(9, 0, 0, 800, graphic);
  }

  private static void triangle(int depth, int startPointX, int startPointY, int size, Graphics g) {

    g.setColor(Color.black);
    int xpoints[] = {startPointX, startPointX + size/2, startPointX + size};
    int ypoints[] = {startPointY, startPointY + size, startPointY};
    int npoints = 3;
    g.drawPolygon(xpoints, ypoints, npoints);

    depth--;

    if (depth > 0) {
      triangle(depth, startPointX, startPointY, size/2, g);
      triangle(depth,startPointX + size/4, startPointY + size/2, size/2, g );
      triangle(depth, startPointX + size/2, startPointY, size/2, g);
    }
  }
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawng");
    jFrame.setSize(new Dimension(700, 700));
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
