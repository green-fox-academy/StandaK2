import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Game extends JComponent implements KeyListener {

    private List<Drawable> drawables;
    private List<Movable> movables;

    public Game() {

        this.movables = new ArrayList<>(createListOfMovables(3, 6));
        this.drawables = new ArrayList<>(
                Arrays.asList(new Matrix(new Wall(), new Path()),  new StatusBar(this.movables)));
        this.drawables.addAll(this.movables);

        setPreferredSize(new Dimension(Tile.tilePixels * Matrix.getLenght(),
                Tile.tilePixels * Matrix.getLenght() + StatusBar.statusBarPixels));
        setVisible(true);
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);

        for (Drawable drawable:this.drawables) {
            drawable.draw(graphics);
        }
    }

    private List<Movable> createListOfMovables(int from, int to){
        int randomNumber = (int) (Math.random() * (to - from));
        List<Movable> objectList= new ArrayList<>();
        objectList.add(new Warrior());
        objectList.add(new Boss());
        for (int i = 0; i < from + randomNumber; i++) {
            objectList.add(new Skeleton());
        }
        return  objectList;
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            for (Movable movable : this.movables) {
                movable.moveUp();
            }
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            for (Movable movable : this.movables) {
                movable.moveDown();
            }
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            for (Movable movable : this.movables) {
                movable.moveLeft();
            }
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            for (Movable movable : this.movables) {
                movable.moveRight();
            }
        }

        for (Movable movable : movables) {
            movable.setMoveCondition();
        }
        repaint();
    }
}
