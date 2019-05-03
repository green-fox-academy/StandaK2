package garden;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Object> gardenList = new ArrayList<>();
        Garden garden = new Garden(gardenList);

        gardenList.add(new Flower("yellow"));
        gardenList.add(new Flower("blue"));
        gardenList.add(new Tree("purple"));
        gardenList.add(new Tree("orange"));
        gardenList.add(new GardenElf("red hat"));
        gardenList.add(new GardenElf("green hat", 7));

        System.out.println(garden);
        garden.water(40);
        garden.water(70);

        garden.repair();
    }
}
