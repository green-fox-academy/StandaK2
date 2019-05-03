package garden;

import java.util.List;

public class Garden {

    List<Object> gardenList;

    public Garden(List<Object> gardenList) {
        this.gardenList = gardenList;
    }

    private int getWaterableCount() {
        int count = 0;
        for (Object object : this.gardenList) {
            if (object instanceof Waterable) {
                count++;
            }
        }
        return count;
    }

    public void water(double waterAmount) {

        for (Object object : this.gardenList) {
            if (object instanceof Waterable) {
                ((Waterable) object).water(waterAmount / getWaterableCount());
            }
        }
        System.out.println("watering with " + waterAmount);
        System.out.println(this);
    }

    public void repair() {

        for (Object object : this.gardenList) {
            if (object instanceof Repairable) {
                ((Repairable) object).repair();
            }
        }
        System.out.println("repairing repairable");
        System.out.println(this);
    }

    @Override
    public String toString() {
        String result = "All garden elements:\n";

        for (Object object : this.gardenList) {
            result +=  object.toString();
        }
        return result;
    }
}


