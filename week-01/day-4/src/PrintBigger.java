// Write a program that asks for two numbers and prints the bigger one
import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        int number1 = scanner.nextInt();
        System.out.println("Enter second number:");
        int number2 = scanner.nextInt();

        if (number1 > number2) {
            System.out.println(number1);
        }   else {
            System.out.println(number2);
        }

    }
}