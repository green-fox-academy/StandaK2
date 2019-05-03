package garden;

public class GardenElf extends Decoration {

    public GardenElf(String color) {
        this.color = color;
        this.lifeLimit = 5;
        this.lifeState = 0;
    }

    public GardenElf(String color, int lifeState) {
        this.color = color;
        this.lifeLimit = 5;
        this.lifeState = lifeState;
    }
}
