package garden;

public class Tree extends Plant{

    public Tree(String color) {
        this.color = color;
        this.waterLimit = 10.0;
        this.waterAbsorpsion = 0.75;
        this.waterState = 0;
    }
}
