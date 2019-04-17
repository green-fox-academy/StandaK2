//Reuse your Animal class
//Create a Farm class
//it has list of Animals
//                it has slots which defines the number of free places for animals
//        breed() -> creates a new animal if there's place for it
//        slaughter() -> removes the least hungry animal

package farm;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Farm myFarm = new Farm(initializeAnimals(), 4);

        System.out.println(myFarm);
        myFarm.breed(new Animal("deer"));
        System.out.println(myFarm);
        myFarm.slaughter();
        myFarm.slaughter();
        System.out.println(myFarm);
    }


    public static List<Animal> initializeAnimals() {
        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Animal("cow"));
        animalList.add(new Animal("duck", 10, 30));
        animalList.add(new Animal("horse", 15, 45));
        animalList.add(new Animal("pig"));
        animalList.add(new Animal("goat", 5, 15));
        animalList.add(new Animal("sheep"));
        return animalList;
    }
}
