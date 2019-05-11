import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Tile implements Drawable{

        private BufferedImage image;
        protected static int tilePixels = 72;

    protected int[] currentPositionXY;

        public Tile(String fileName) {
            this.currentPositionXY = new int[]{0, 0};
            try {
                this.image = ImageIO.read(new File(fileName));
            } catch (IOException e) {
                System.out.println("cannot read file");
                e.printStackTrace();
            }
        }

    public void draw(Graphics graphics) {
        if (this.image != null) {
            graphics.drawImage(this.image, this.currentPositionXY[0]*tilePixels, this.currentPositionXY[1]*tilePixels, null);
        }
    }

    public void setCurrentPositionXY(int posX, int posY) {
        this.currentPositionXY[0] = posX;
        this.currentPositionXY[1] = posY;
    }
}
