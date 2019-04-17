package petrolstation;

public class Main {
    public static void main(String[] args) {

        Station agip = new Station(5000);
        Car skoda = new Car();
        Car vw = new Car(200, 40);

        System.out.println(skoda.gasAmount);
        System.out.println(vw.gasAmount);
        System.out.println(agip.gasAmount);

        agip.refillCar(skoda);
        System.out.println(skoda.gasAmount);
        System.out.println(agip.gasAmount);

        agip.refillCar(vw);
        System.out.println(vw.gasAmount);
        System.out.println(agip.gasAmount);
    }
}
