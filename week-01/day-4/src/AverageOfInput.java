// Write a program that asks for 5 integers in a row,
// then it should print the sum and the average of these numbers like:
//
// Sum: 22, Average: 4.4

import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int total = 0;
        int average = 0;

        for (int i = 1; i < 6; i++) {

            System.out.println("Enter the whole number:");
            int number = scanner.nextInt();
            total += number;
            average = total / i;
        }

        System.out.println("Sum: " + total + ", Average: " + average);
    }
}