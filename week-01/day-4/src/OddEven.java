// Write a program that reads a number from the standard input,
// Then prints "Odd" if the number is odd, or "Even" if it is even.

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the whole number:");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("The number is even.");
        }   else {
                System.out.println("The number is odd.");
        }
    }
}
