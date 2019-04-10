import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CenterBoxFunction {

    public static void mainDraw(Graphics graphics) {
        // create a square drawing function that takes 2 parameter:
        // the square size and the graphics
        // and draws a square of that size to the center of the canvas.
        // draw 3 squares with that function.
        // avoid code duplication.

        int numberOfSquares = 3;
        for (int i = 0; i < numberOfSquares; i++) {
            int randomSize = (int) (Math.random() * Math.min(WIDTH, HEIGHT));
            drawSquareInCenter(randomSize, graphics);
        }
//        rainbowHypno(10, graphics);
    }

    public static void drawSquareInCenter(int size, Graphics graphics) {

        Color color = new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256));
        graphics.setColor(color);
        graphics.drawRect(WIDTH / 2 - size / 2, HEIGHT / 2 - size / 2, size, size);
    }

    public static void rainbowHypno(int numberOfSquares, Graphics graphics) {

        for (int count = 0; count < numberOfSquares; count++) {
            for (int j = 0; j < 256; j += 1) {
                for (int k = 0; k < 256; k += 1) {
                    for (int l = 0; l < 256; l += 1) {
                        int randomSize = (int) (Math.random() * Math.min(WIDTH, HEIGHT));

                        Color color = new Color(j, k, l);
                        graphics.setColor(color);
                        graphics.drawRect(WIDTH / 2 - randomSize / 2, HEIGHT / 2 - randomSize / 2, randomSize, randomSize);
                    }
                    k++;
                }
                j++;
            }
        }

    }

    // Don't touch the code below
    static int WIDTH = 800;
    static int HEIGHT = 800;

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