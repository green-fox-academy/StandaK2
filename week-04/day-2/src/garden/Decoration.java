package garden;

public class Decoration implements Repairable{

    protected String color;
    protected double lifeLimit;
    protected double lifeState;

    @Override
    public void repair() {
        this.lifeState /= 2;
    }

    public boolean needRepair() {
        return (lifeState >= lifeLimit);
        }

    @Override
    public String getRepairStatus() {
        if(needRepair()){
            return "needs to be repaired";
        } else {
            return "doesn't need to be repaired";
        }
    }

    public String getColor() {
        return color;
    }

    public double getLifeState() {
        return lifeState;
    }

    @Override
    public String toString() {
        String result = "The " + this.getColor() + " " + this.getClass().getSimpleName() + " " +
                this.getRepairStatus() + "\n";
        return result;
    }
}
