import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class HorizontalLines {
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 3 parameters:
        // The x and y coordinates of the line's starting point and the graphics
        // and draws a 50 long horizontal line from that point.
        // Draw 3 lines with that function. Use loop for that.

        for (int i = 0; i < 3; i++) {
            drawFiftyHorizontalLines(100 * i, 100 * i, graphics);
//            drawFiftyHorizontalLines((int)(Math.random() * WIDTH), (int)(Math.random() * HEIGHT), graphics);
        }
    }

    public static void drawFiftyHorizontalLines(int initX, int initY, Graphics graphics) {

        Color color = new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256));

        int spaceBetweenLines = 10;
        for (int i = 0; i < 50; i++) {
            graphics.setColor(color);
            graphics.drawLine(initX, initY + i * spaceBetweenLines, WIDTH - initX, initY + i * spaceBetweenLines);
        }
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