import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class Warrior extends Character{

//    The level of the Hero
//    The max HP (health point) of the Hero
//    The current HP of the Hero
//    The DP (defend point) of the Hero
//    The SP (strike point) of the Hero

    private int level;
    private int maxHealthPoint;
    private int currentHealthPoint;
    private int defendPoint;
    private int strikePoint;
    private String fileName;

    public Warrior(String fileName) {
        super(fileName, 0, 0);
        this.fileName = fileName;
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

    public int getLevel() {
        return level;
    }

    public int getMaxHealthPoint() {
        return maxHealthPoint;
    }

    public int getCurrentHealthPoint() {
        return currentHealthPoint;
    }

    public int getDefendPoint() {
        return defendPoint;
    }

    public int getStrikePoint() {
        return strikePoint;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setCurrentHealthPoint(int currentHealthPoint) {
        this.currentHealthPoint = currentHealthPoint;
    }

    public void setDefendPoint(int defendPoint) {
        this.defendPoint = defendPoint;
    }

    public void setStrikePoint(int strikePoint) {
        this.strikePoint = strikePoint;
    }
}

