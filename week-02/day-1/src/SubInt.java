import java.util.Arrays;

public class SubInt {
    public static void main(String[] args) {
        //  Create a function that takes a number and an array of integers as a parameter
        //  Returns the indices of the integers in the array of which the first number is a part of
        //  Or returns an empty array if the number is not part of any of the integers in the array

        //  Example>
        int[] array = {1, 11, 34, 53, 61};
        int number = 3;

        int[] test1 = subInt(number, array);
        System.out.println(Arrays.toString(test1));

    }

    public static int[] subInt(int number, int[] array) {

        int[] indices = new int[array.length];
        int index = 0;

        for (int i : array) {
            int decimal = i / 10;
            int units = i - decimal * 10;
            if (number == decimal || number == units) {
                indices[index] = i;
                index++;
            }
        }
        return indices;
    }
}