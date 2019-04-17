package petrolstation;

public class Car {
    int gasAmount;
    int capacity;

    public Car() {
        this.gasAmount = 0;
        this.capacity = 100;
    }

    public Car(int capacity, int gasAmount) {
        this.gasAmount = gasAmount;
        this.capacity = capacity;
    }
}
