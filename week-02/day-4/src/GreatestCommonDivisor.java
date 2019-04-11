//Find the greatest common divisor of two numbers using recursion.

public class GreatestCommonDivisor {
    public static void main(String[] args) {

        System.out.println(GreatestDivisor(15, 140));
    }

    public static int GreatestDivisor(int number1, int number2) {

        if (number1 % number2 != 0) {
            return GreatestDivisor(number2, number1 % number2);
        } else {
            return number2;
        }
    }
}
