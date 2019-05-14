import java.util.HashMap;

public class Skeleton extends Character {

    public Skeleton() {
        super();
        this.maxHealthPoint = 2 * this.level * dieRoll();
        this.currentHealthPoint = this.maxHealthPoint;
        this.defendPoint = this.level/2 * dieRoll();
        this.strikePoint = this.level * dieRoll();
        this.currentPositionXY = Matrix.giveMeRandomCoordinates();
        this.images = new HashMap<String, String>() {{
            put("INIT", "img/skeleton.png");
            put("UP", "img/skeleton.png");
            put("DOWN", "img/skeleton.png");
            put("LEFT", "img/skeleton.png");
            put("RIGHT", "img/skeleton.png");
            put("DEAD", "img/skeleton.png");
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
        this.randomMove();
    }

    @Override
    public void moveDown() {
        this.randomMove();
    }

    @Override
    public void moveLeft() {
        this.randomMove();
    }

    @Override
    public void moveRight() {
        this.randomMove();
    }
}

