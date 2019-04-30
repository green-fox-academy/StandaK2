// import PositionedImage.PositionedImage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {

    Path path;
    Wall wall;
    Warrior warrior;
    Skeleton skeleton;
    int numberOfSkeleton = 3;
    Boss boss;
    int callNumber = 0;
    Matrix matrix;

    int stepI = 0;
    int stepJ = 0;
    int tileSize = 72;

    public Board() {

        // initializing all elements on board
        this.matrix = new Matrix();
        this.path = new Path();
        this.wall = new Wall();
        this.skeleton = new Skeleton();
        this.boss = new Boss();
        this.warrior = new Warrior("img/hero-down.png");

        // create random skeletons on board (value of two)
        for (int i = 0; i < numberOfSkeleton; i++) {
        this.matrix.setValue(matrix.giveMeRandomCoordinates()[0], matrix.giveMeRandomCoordinates()[1], 2);
        }

        // create main boss (value of three)
        this.matrix.setValue(matrix.giveMeRandomCoordinates()[0], matrix.giveMeRandomCoordinates()[1], 3);

        // set the size of your draw board
        setPreferredSize(new Dimension(this.tileSize*10, this.tileSize*10));
        setVisible(true);
    }


    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);

        // draw board according to multidim. array this.this.matrix
        for (int i = 0; i < this.matrix.getLenght(); i++) {
            this.wall.posY = this.tileSize * i;
            this.path.posY = this.tileSize * i;
            this.skeleton.posY = this.tileSize * i;
            this.boss.posY = this.tileSize * i;

            for (int j = 0; j < this.matrix.getLenght(); j++) {
                this.wall.posX = this.tileSize * j;
                this.path.posX = this.tileSize * j;
                this.skeleton.posX = this.tileSize * j;
                this.boss.posX = this.tileSize * j;

                int numCondition = this.matrix.getValue(i, j);

                // draw wall on board
                if (numCondition == 0){
                    this.path.draw(graphics);
                }
                if (numCondition == 1) {
                    this.wall.draw(graphics);

                }
                // draw skeleton on board
                if (numCondition == 2) {
                    this.path.draw(graphics);
                    this.skeleton.draw(graphics);

                }
                // draw boss on board
                if (numCondition == 3) {
                    this.path.draw(graphics);
                    this.boss.draw(graphics);

                }
            }
        }

        // draw warrior on board
        this.warrior.draw(graphics);

    }

    // To be a KeyListener the class needs to have these 3 methods in it
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    // But actually we can use just this one for our goals here
    @Override
    public void keyReleased(KeyEvent e) {
        // When the up or down keys hit, we change the position of our box

        try {
            if (e.getKeyCode() == KeyEvent.VK_UP) {
                if(this.matrix.getValue(this.stepI - 1, stepJ) == 0) {
                    this.stepI--;
                    this.warrior.setImage("img/hero-up.png");
                    this.warrior.posY -= this.tileSize;
                }
            } else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
                if(this.matrix.getValue(this.stepI + 1, stepJ) == 0) {
                    this.stepI++;
                    this.warrior.setImage("img/hero-down.png");
                    this.warrior.posY += this.tileSize;
                }
            } else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
                if(this.matrix.getValue(this.stepI, stepJ - 1) == 0) {
                    this.stepJ--;
                    this.warrior.setImage("img/hero-left.png");
                    this.warrior.posX -= this.tileSize;
                }
            } else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
                if(this.matrix.getValue(this.stepI, stepJ + 1) == 0) {
                    this.stepJ++;
                    this.warrior.setImage("img/hero-right.png");
                    this.warrior.posX += this.tileSize;
                }
            }

        } catch (ArrayIndexOutOfBoundsException error){
        }

        // and redraw to have a new picture with the new coordinates
        repaint();
    }
}
