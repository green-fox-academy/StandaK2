package garden;

public class Flower extends Plant {

    public Flower(String color) {
        this.color = color;
        this.waterLimit = 5.0;
        this.waterAbsorpsion = 0.75;
        this.waterState = 0;
    }

}
