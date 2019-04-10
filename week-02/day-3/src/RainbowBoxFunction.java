import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 3 parameters:
        // The square size, the fill color, graphics
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares.

        // ARRAY LIST WITH COLORS
        ArrayList <Color> colors = new ArrayList<>();
        colors.add(0, new Color(255, 21, 23));
        colors.add(1, new Color(255, 120, 0));
        colors.add(2, new Color(255, 240, 4));
        colors.add(3, new Color(26, 255, 41));
        colors.add(4, new Color(27, 255, 231));
        colors.add(5, new Color(32, 72, 255));
        colors.add(6, new Color(242, 47, 255));

        int numberOfSquares = 7;

        for (int i = numberOfSquares - 1; i >= 0; i--) {
            drawSquareInCenter(WIDTH/numberOfSquares*(i+1), colors.get(i), graphics);
        }
    }

    public static void drawSquareInCenter(int size, Color color, Graphics graphics) {

        graphics.setColor(color);
        graphics.fillRect(WIDTH / 2 - size / 2, HEIGHT / 2 - size / 2, size, size);
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
        }
    }
}
