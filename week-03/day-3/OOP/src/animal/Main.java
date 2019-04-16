package animal;

public class Main {
    public static void main(String[] args) {

        Animal monkey = new Animal();
        Animal bear = new Animal(10, 20);

        monkey.eat();
        monkey.drink();
        bear.play();

        System.out.println(monkey.hunger);
        System.out.println(monkey.thirst);
        System.out.println(bear.hunger);
        System.out.println(bear.thirst);
    }
}
