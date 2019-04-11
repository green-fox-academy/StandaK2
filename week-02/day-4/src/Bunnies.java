// We have a number of bunnies and each bunny has two big floppy ears. We want to compute the total
// number of ears across all the bunnies recursively (without loops or multiplication).

public class Bunnies {
    public static void main(String[] args) {

        System.out.println(Bunnies(10));
    }

    public static double Bunnies(double numberOfBunnies) {

        if (numberOfBunnies > 0) {
            return 1 + Bunnies(numberOfBunnies - 0.5);
        }
        return 0;
    }
}
