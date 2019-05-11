import java.util.HashMap;

public class Warrior extends Character{

    public Warrior() {
        super();
        this.maxHealthPoint = 10;
        this.currentHealthPoint = this.maxHealthPoint;
        this.defendPoint = 10;
        this.strikePoint = 6;
        this.currentPositionXY = new int[]{0, 0};
        this.images = new HashMap<String, String>() {{
            put("INIT", "img/hero-down.png");
            put("UP", "img/hero-up.png");
            put("DOWN", "img/hero-down.png");
            put("LEFT", "img/hero-left.png");
            put("RIGHT", "img/hero-right.png");
            put("DEAD", "img/hero-dead.png");
        }};
        this.setImageFile("DOWN");
    }

    @Override
    public void setMoveCondition() {
        this.moveCondition = isAlive();
    }

    @Override
    public void moveUp(){
        if(ifICanIMove(this.currentPositionXY[0], this.currentPositionXY[1] - 1, 1,
                -1, "UP")){
            Character.stepCounter++;
        }
    }

    @Override
    public void moveDown() {
        if(ifICanIMove(this.currentPositionXY[0], this.currentPositionXY[1] + 1, 1,
                1, "DOWN")) {
            Character.stepCounter++;
        }
    }

    @Override
    public void moveLeft() {
        if(ifICanIMove(this.currentPositionXY[0] - 1, this.currentPositionXY[1], 0,
                -1, "LEFT")) {
            Character.stepCounter++;
        }
    }

    @Override
    public void moveRight() {
        if(ifICanIMove(this.currentPositionXY[0] + 1, this.currentPositionXY[1], 0,
                +1, "RIGHT")) {
            Character.stepCounter++;
        }
    }
}



