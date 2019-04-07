// Write a program that asks for a number.
// It would ask this many times to enter an integer,
// if all the integers are entered, it should print the sum and average of these
// integers like:
//
// Sum: 22, Average: 4.4

import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many numbers to count:");
        int numbersCount = scanner.nextInt();
        int average = 0;
        int sum = 0;

        for (int i = 0; i < numbersCount; i++) {
            System.out.println("Enter whole number:");
            int number = scanner.nextInt();

            sum += number;
            average = sum / (i + 1);
        }
        System.out.println("Sum: " + sum + ", Average: " + average);

    }

}

