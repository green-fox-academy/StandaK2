// We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3, ..) have the normal 2 ears.
// The even bunnies (2, 4, ..) we'll say have 3 ears, because they each have a raised foot. Recursively return
// the number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).

public class BunniesAgain {
    public static void main(String[] args) {

        System.out.println(BunniesAgain(2));
    }

    public static int BunniesAgain(int numberOfBunnies) {

        if (numberOfBunnies > 0) {
            if (numberOfBunnies % 2 != 0) {
                return 2 + BunniesAgain(numberOfBunnies - 1);
            } else {
                return 3 + BunniesAgain(numberOfBunnies - 1);
            }
        }
        return 0;
    }
}
