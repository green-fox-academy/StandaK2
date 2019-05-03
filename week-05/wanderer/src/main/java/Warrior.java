import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class Warrior extends Character{

    public Warrior(String fileName) {
        super(fileName, 0, 0);
        this.fileName = "img/hero-down.png";
        this.maxHealthPoint = 10;
        this.currentHealthPoint = this.maxHealthPoint;
        this.defendPoint = 10;
        this.strikePoint = 6;

    }

    public void setImage(String fileName) {
        this.fileName = fileName;
        try {
            image = ImageIO.read(new File(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

