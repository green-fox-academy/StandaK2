// Given a non-negative int n, return the sum of its digits recursively (no loops). Note
// that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10
// removes the rightmost digit (126 / 10 is 12).

public class SumDigits {
    public static void main(String[] args) {

        System.out.println(SumOfDigits(12345));
    }

    public static int SumOfDigits(int number) {

        if (number > 0) {
            if (number >= 10) {
                return (number % 10 + SumOfDigits(number / 10));
            } else {
                return (number % 10);
            }
        }
        return 0;
    }
}
