// Create a function that takes a number
// divides ten with it,
// and prints the result.
// It should print "fail" if the parameter is 0

import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input integer number: ");
        int divisor = scanner.nextInt();
        int dividend = 10;

        DivisionByInput(dividend, divisor);
    }

    public static void DivisionByInput(int dividend, int divisor){
        try{
            int result = dividend / divisor;
            System.out.println("10 / " + divisor + " = " + result);
        } catch (ArithmeticException error){
            System.out.println("Can't divide by zero");
        }
    }
}
