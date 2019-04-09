//  Create a function that takes a list of numbers as a parameter
//  Returns a list of numbers where every number in the list occurs only once

//  Example

import java.util.Arrays;

public class Unique {
    public static void main(String[] args) {


        int[] test1 = {1, 11, 34, 11, 52, 61, 1, 34};

        System.out.println(Arrays.toString(subInt(test1)));
    }

    public static int[] subInt(int[] array) {

        int[] arrayTemp = Arrays.copyOf(array, array.length);
        Arrays.sort(arrayTemp);
        int[] arrayUnique = new int[arrayTemp.length];

        int index = 0;
        for (int i = 0; i < arrayTemp.length; i++) {
            if (arrayTemp[i] != arrayTemp[i+1]){
                arrayUnique[index] = arrayTemp[i];
                index++;
                }
        } return arrayUnique;
    }
}
