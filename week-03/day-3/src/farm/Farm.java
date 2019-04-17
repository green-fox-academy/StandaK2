package farm;

import java.util.List;

public class Farm {

    List<Animal> animals;
    int slots;

    public Farm(List<Animal> animals, int slots) {
        this.animals = animals;
        this.slots = slots;
    }

    public void breed(String type) {
        if (slots > 0) {
            this.animals.add(new Animal(type));
            this.slots--;
        }
    }

    public void slaughter() {
        Animal animalToKill = new Animal(null);
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i).hunger < animalToKill.hunger) {
                animalToKill = animals.get(i);
            }
        }
        this.animals.remove(animalToKill);
        this.slots++;
    }

    @Override
    public String toString() {
        String result = "";
        for (Animal animal : this.animals) {
            result += ("type: " + animal.type + ", hunger: " + animal.hunger + ", thirst: " + animal.thirst) + "\n";
        }
        return result + "slots: " + this.slots + "\n";
    }
}
