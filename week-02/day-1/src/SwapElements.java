// - Create an array variable named `abc`
//   with the following content: `["first", "second", "third"]`
// - Swap the first and the third element of `abc`

import java.util.Arrays;

public class SwapElements {
    public static void main(String[] args) {

        String[] abc = {"first", "second", "third"};
        System.out.println(Arrays.toString(abc));
        String first = abc[0];
        String second = abc[2];
        abc[0] = second;
        abc[2] = first;
        System.out.println(Arrays.toString(abc));
    }
}
