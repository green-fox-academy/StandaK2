import javax.swing.*;

import java.awt.*;

import static java.lang.Math.random;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class GoToCenter {
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 3 parameters:
        // The x and y coordinates of the line's starting point and the graphics
        // and draws a line from that point to the center of the canvas.
        // Draw 3 lines with that function. Use loop for that.

        for (int i = 0; i < 1000; i++) {
            drawLineToCenter((int) (Math.random() * WIDTH), (int) (Math.random() * HEIGHT), graphics);
        }
    }

    // The x and y coordinates of the line's starting point and the graphics
    // and draws a line from that point to the center of the canvas.
    public static void drawLineToCenter(int initX, int initY, Graphics graphics) {

        graphics.drawLine(initX, initY, WIDTH / 2, HEIGHT / 2);

    }

    // Don't touch the code below
    static int WIDTH = 1000;
    static int HEIGHT = 1000;

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
        }
    }
}