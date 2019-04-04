import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter distance in kilometres (integer type):");
        double distanceKm = scanner.nextDouble();
        double distanceMile = distanceKm / 1.609344;
        System.out.println(distanceKm + " km is " + distanceMile + " miles.");
    }
}
