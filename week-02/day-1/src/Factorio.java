//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial

public class Factorio {
    public static void main(String[] args) {

        int factNumber = 5;
        System.out.println(factorio(factNumber));
    }

    public static int factorio(int factNumber) {
        int factorial = 1;
        for (int i = 0; i < factNumber; i++) {
            factorial *= i + 1;
        }
        return (factorial);
    }
}
