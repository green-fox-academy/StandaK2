import javax.swing.*;

import java.awt.*;

import static java.awt.image.ImageObserver.WIDTH;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Squares {

    public static void mainDraw(Graphics graphics) {
        // draw four different size and color rectangles.
        // avoid code duplication.

        int width = WIDTH;
        int height = HEIGHT;
        int x = 0;
        int y = 0;
        int count = 10;

        drawFourRectangle(count, x, y, width, height, graphics);
    }

    public static void drawFourRectangle(int count, int x, int y, int width, int height, Graphics graphics) {

        if (count > 0) {
            //int third = width / 3;
            graphics.drawRect(x, y, width, height);

            drawFourRectangle(count - 1, x + width / 3, y, width / 3, width / 3, graphics);
            drawFourRectangle(count - 1, x, y + width / 3, width / 3, width / 3, graphics);
            drawFourRectangle(count - 1, x + width / 3, y + 2 * width / 3, width / 3, width / 3, graphics);
            drawFourRectangle(count - 1, x + 2 * width / 3, y + width / 3, width / 3, width / 3, graphics);
        }
    }

    // Don't touch the code below
    static int WIDTH = 500;
    static int HEIGHT = 500;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
            this.setBackground(Color.yellow);
        }
    }
}

