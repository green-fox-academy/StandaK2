// Create the usual class wrapper and main method on your own.

// Write a function called `sum` that returns the sum of numbers from zero to the given parameter

public class Sum {
    public static void main(String[] args) {

        int number = 15;
        System.out.println(sum(number));
    }

    public static int sum(int number) {
        int sum = 0;
        for (int i = 0; i < number; i++) {
            sum += i;
        }
        return (sum);
    }
}
