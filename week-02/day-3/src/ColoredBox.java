import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {
    public static void mainDraw(Graphics graphics) {
        // Draw a box that has different colored lines on each edge.

        graphics.setColor(Color.red);
        graphics.drawLine(50, 50, 500, 50);
        graphics.setColor(Color.blue);
        graphics.drawLine(50, 50, 50, 500);
        graphics.setColor(Color.green);
        graphics.drawLine(500, 50, 500, 500);
        graphics.setColor(Color.yellow);
        graphics.drawLine(50, 500, 500, 500);
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