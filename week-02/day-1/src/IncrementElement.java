// - Create an array variable named `t`
//         with the following content: `[1, 2, 3, 4, 5]`
//         - Increment the third element
//         - Print the third element

public class IncrementElement {
    public static void main(String[] args) {
        int[] t = {1, 2, 3, 4, 5};
        int increment = 1;
        t[2] += increment;
        System.out.println(t[2]);
    }
}
