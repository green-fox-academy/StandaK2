import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public abstract class Character implements Movable {

    private BufferedImage image;
    protected String fileName;
    protected int[] currentPositionXY;
    protected static int stepCounter;
    protected boolean moveCondition;
    protected int level;
    protected int maxHealthPoint;
    protected int currentHealthPoint;
    protected int defendPoint;
    protected int strikePoint;
    private static int dieSide = 6;
    protected HashMap<String, String> images;

    public Character() {
        stepCounter = 0;
        this.moveCondition = false;
        this.level = 1;
    }

    public boolean isAlive(){
        return currentHealthPoint > 0;
    }

    @Override
    public int[] getCurrentPositionXY() {
        return this.currentPositionXY;
    }

    public void draw(Graphics graphics) {
        if (this.image != null) {
            graphics.drawImage(this.image, this.currentPositionXY[0]* Tile.tilePixels,
                    this.currentPositionXY[1]* Tile.tilePixels, null);
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


    public void setImageFile(String keyImageType){
        this.fileName = images.get(keyImageType);
        try {
            this.image = ImageIO.read(new File(this.fileName));
        } catch (IOException error) {
            error.printStackTrace();
        }
    }

    public void randomMove() {
        boolean foundPath = false;
        if (this.moveCondition) {
            while (!foundPath) {
                int randomNumber = (int) (Math.random() * 4);
                switch (randomNumber) {
                    case 0: if(ifICanIMove(this.currentPositionXY[0], this.currentPositionXY[1] - 1, 1,
                            -1, "UP")){
                        foundPath = true;
                        break;
                    }
                    case 1: if(ifICanIMove(this.currentPositionXY[0], this.currentPositionXY[1] + 1, 1,
                            1, "DOWN")) {
                        foundPath = true;
                        break;
                    }
                    case 2:  if(ifICanIMove(this.currentPositionXY[0] - 1, this.currentPositionXY[1], 0,
                            -1, "LEFT")) {
                        foundPath = true;
                        break;
                    }
                    case 3: if(ifICanIMove(this.currentPositionXY[0] + 1, this.currentPositionXY[1], 0,
                            1, "RIGHT")) {
                        foundPath = true;
                        break;
                    }
                }
            }
        }
    }

    public static int dieRoll(){
        return (int) (Math.random() * dieSide);

    }

    public boolean ifICanIMove(int PositionX, int PositionY, int axis, int XYChange, String direction){
        try {
            if (Matrix.getValue(PositionX, PositionY) == 0 && this.moveCondition) {
                this.currentPositionXY[axis] += XYChange;
                this.setImageFile(direction);
                return true;
            }
        } catch (ArrayIndexOutOfBoundsException error){
//            System.out.println("bound error");
            return false;
        }
        return false;
    }

    @Override
    public abstract void moveUp();

    @Override
    public abstract void moveDown();

    @Override
    public abstract void moveLeft();

    @Override
    public abstract void moveRight();

    @Override
    public abstract void setMoveCondition();
}
