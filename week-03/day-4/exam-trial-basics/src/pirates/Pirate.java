package pirates;

public class Pirate {

    String name;
    int amountOfGold;
    int healthPoints;
    boolean captain = false;
    boolean woodenLeg = false;

    public Pirate(String name, boolean captain, boolean woodenLeg, int amountOfGold, int healthPoints) {
        this.name = name;
        this.amountOfGold = amountOfGold;
        this.healthPoints = healthPoints;
        this.captain = captain;
        this.woodenLeg = woodenLeg;
    }

    public Pirate(String name) {
        this(name, false, false, 10, 10);
    }

    public Pirate(String name, boolean captain, boolean woodenLeg) {
        this(name, captain, woodenLeg, 10, 10);
    }

    public void work() {
        if (this.captain) {
            this.amountOfGold += 10;
            this.healthPoints -= 5;
        } else {
            this.amountOfGold++;
            this.healthPoints--;
        }
    }

    public void party() {
        if (this.captain) {
            this.healthPoints += 10;
        } else {
            this.healthPoints++;
        }
    }

    @Override
    public String toString() {
        if (this.woodenLeg) {
            return "Hello, I am " + this.name + ". I have wooden leg and " + this.amountOfGold + " golds.";
        } else {
            return "Hello, I am " + this.name + ". I still have my real legs and " + this.amountOfGold + " golds.";
        }
    }
}
