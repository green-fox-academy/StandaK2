// We have a number of bunnies and each bunny has two big floppy ears. We want to compute the total
// number of ears across all the bunnies recursively (without loops or multiplication).

public class Bunnies {
    public static void main(String[] args) {

        System.out.println(Bunnies(10));
    }

    public static int Bunnies(int numberOfBunnies) {

        if (numberOfBunnies > 0) {
            return 2 + Bunnies(numberOfBunnies - 1);
        }
        return 0;
    }
}
