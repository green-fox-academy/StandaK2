// import PositionedImage.PositionedImage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;

public class Board extends JComponent implements KeyListener {

    private Path path;
    private Wall wall;
    private Warrior warrior;
    private List<Skeleton> skeletons;
    private int numberOfSkeleton = 3;
    private Boss boss;
    private Matrix matrix;

    private int stepI = 0;
    private int stepJ = 0;
    private int tileSize = 72;

    public Board() {

        // initializing all elements on board
        this.matrix = new Matrix();
        this.path = new Path();
        this.wall = new Wall();
        this.skeletons = new ArrayList<>();
        //this.skeleton = new Skeleton();
        this.boss = new Boss();
        this.warrior = new Warrior("img/hero-down.png");

        // create random skeletons on board
        for (int i = 0; i < numberOfSkeleton; i++) {
            this.skeletons.add(new Skeleton());
            int[] randomSkeletonCoor = this.matrix.giveMeRandomCoordinates();
            this.skeletons.get(i).setPosXY(randomSkeletonCoor[0]*this.tileSize, randomSkeletonCoor[1]*this.tileSize);
        }

        // create main boss
        int[] randomBossCoor = this.matrix.giveMeRandomCoordinates();
        this.boss.setPosXY(randomBossCoor[0]*this.tileSize, randomBossCoor[1]*this.tileSize);

        // set the size of your draw board
        setPreferredSize(new Dimension(this.tileSize * 10, this.tileSize * 10 + 50));
        setVisible(true);
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);

        // draw board according to 2dim. array this.matrix
        for (int i = 0; i < this.matrix.getLenght(); i++) {
            this.wall.posY = this.tileSize * i;
            this.path.posY = this.tileSize * i;
            for (int j = 0; j < this.matrix.getLenght(); j++) {
                this.wall.posX = this.tileSize * j;
                this.path.posX = this.tileSize * j;

                // draw wall on board
                if (this.matrix.getValue(i, j) == 0) {
                    this.path.draw(graphics);
                }
                // draw path on board
                if (this.matrix.getValue(i, j) == 1) {
                    this.wall.draw(graphics);
                }
            }
        }

        // draw skeleton on board
        for (int i = 0; i < skeletons.size(); i++) {
            this.skeletons.get(i).draw(graphics);
        }

        // draw boss on board
        this.boss.draw(graphics);

        // draw warrior on board
        this.warrior.draw(graphics);

        // draw String
        // Hero (Level 1) HP: 8/10 | DP: 8 | SP: 6
        graphics.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
        graphics.drawString("Hero: (Level " + warrior.getLevel() + ")\t HP: " + warrior.getCurrentHealthPoint() +
                "/" + warrior.getMaxHealthPoint() + "\t|\tDP: " + warrior.getDefendPoint() + "\t|\tSP: " +
                warrior.getStrikePoint(), 0, 10 * tileSize + 20);
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
                if (this.matrix.getValue(this.stepI - 1, stepJ) == 0) {
                    this.stepI--;
                    this.warrior.setImage("img/hero-up.png");
                    this.warrior.posY -= this.tileSize;
                }
            } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                if (this.matrix.getValue(this.stepI + 1, stepJ) == 0) {
                    this.stepI++;
                    this.warrior.setImage("img/hero-down.png");
                    this.warrior.posY += this.tileSize;
                }
            } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                if (this.matrix.getValue(this.stepI, stepJ - 1) == 0) {
                    this.stepJ--;
                    this.warrior.setImage("img/hero-left.png");
                    this.warrior.posX -= this.tileSize;
                }
            } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                if (this.matrix.getValue(this.stepI, stepJ + 1) == 0) {
                    this.stepJ++;
                    this.warrior.setImage("img/hero-right.png");
                    this.warrior.posX += this.tileSize;
                }
            }
        } catch (ArrayIndexOutOfBoundsException error) {
        }

        // and redraw to have a new picture with the new coordinates
        repaint();
    }
}
