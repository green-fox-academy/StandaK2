package garden;

public class Plant implements Waterable {

    protected String color;
    protected double waterLimit;
    protected double waterState;
    protected double waterAbsorpsion;

    public String getWaterStatus() {

        if (this.needsWater()) {
            return "needs water";
        } else {
            return "doesn't need water";
        }
    }

    public boolean needsWater() {
        return (this.waterState < this.waterLimit);
    }

    public void water(double waterAmount) {

        if (needsWater()) {
            this.waterState += waterAmount * this.waterAbsorpsion;
        }
    }

    public String getColor() {
        return color;
    }

    public double getWaterState() {
        return waterState;
    }

    @Override
    public String toString() {
        String result = "The " + this.getColor() + " " + this.getClass().getSimpleName() + " " +
                this.getWaterStatus() + "\n";
        return result;
    }
}
