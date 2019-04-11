// Write a recursive function that takes one parameter: n and adds numbers from 1 to n.

public class NumberAdder {
    public static void main(String[] args) {

        System.out.println(AddNumber(5));
    }

    public static int AddNumber(int endNumber) {

        if (endNumber > 1) {
            endNumber += AddNumber(endNumber - 1);
            return endNumber;
        }
        return 1;
    }
}
