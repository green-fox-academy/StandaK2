//Create an Animal class
//Every animal has a hunger value, which is a whole number
//                Every animal has a thirst value, which is a whole number
//                when creating a new animal object these values are created with the default 50 value
//        Every animal can eat() which decreases their hunger by one
//        Every animal can drink() which decreases their thirst by one
//        Every animal can play() which increases both by one

package farm;

public class Animal {

    int hunger;
    int thirst;
    String type;

    public Animal() {
        this(null, 50, 50);
    }

    public Animal(String type) {
        this(type, 50, 50);
    }

    public Animal(String type, int hunger, int thirst) {
        this.type = type;
        this.hunger = hunger;
        this.thirst = thirst;
    }

    public void eat() {
        this.hunger--;
    }

    public void drink() {
        this.thirst--;
    }

    public void play() {
        this.hunger++;
        this.thirst++;
    }
}
