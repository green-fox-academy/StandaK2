import java.awt.event.KeyListener;

public interface Movable extends Drawable {

    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
    void setMoveCondition();
    int[] getCurrentPositionXY();
}
