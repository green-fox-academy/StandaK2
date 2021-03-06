import java.util.HashMap;

public class Boss extends Character {

    public Boss() {
        super();
        this.maxHealthPoint = 2 * this.level * dieRoll() + dieRoll();
        this.currentHealthPoint = this.maxHealthPoint;
        this.defendPoint = this.level/2 * dieRoll() + dieRoll() / 2;
        this.strikePoint = this.level * dieRoll() + this.level;
        this.currentPositionXY = Matrix.giveMeRandomCoordinates();
        this.images = new HashMap<String, String>() {{
            put("INIT", "img/boss.png");
            put("UP", "img/boss.png");
            put("DOWN", "img/boss.png");
            put("LEFT", "img/boss.png");
            put("RIGHT", "img/boss.png");
            put("DEAD", "img/boss.png");
        }};
        this.setImageFile("DOWN");
    }

    @Override
    public void setMoveCondition() {
        if( this.isAlive() && Character.stepCounter %2 == 0){
            this.moveCondition = true;
        } else this.moveCondition = false;
    }

    @Override
    public void moveUp() {
        randomMove();
    }

    @Override
    public void moveDown() {
        randomMove();
    }

    @Override
    public void moveLeft() {
        randomMove();
    }

    @Override
    public void moveRight() {
        randomMove();
    }
}