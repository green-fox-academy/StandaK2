import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Tile {

        BufferedImage image;
        int posX, posY;

        public Tile(String filename, int posX, int posY) {
            this.posX = posX;
            this.posY = posY;
            try {
                image = ImageIO.read(new File(filename));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    //public Tile() {
    //}


    public void draw(Graphics graphics) {
            if (image != null) {
                graphics.drawImage(image, posX, posY, null);
            }
        }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }
}