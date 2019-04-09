/*

        Remove Durian from List B
        Add Kiwifruit to List A after the 4th element
        Compare the size of List A and List B
        Get the index of Avocado from List A
        Get the index of Durian from List B
        Add Passion Fruit and Pummelo to List B in a single statement
        Print out the 3rd element from List A
*/

import java.util.ArrayList;
import java.util.Arrays;

public class ListIntroduction2 {
    public static void main(String[] args) {

//        Create a list ('List A') which contains the following values:
//        Apple, Avocado, Blueberries, Durian, Lychee

        ArrayList<String> fruit = new ArrayList<>(Arrays.asList("Apple", "Avocado", "Blueberries", "Durian", "Lychee"));
        System.out.println(fruit);

//        Create a new list ('List B') with the values of List A

        ArrayList<String> fruitNew = new ArrayList<>();
        fruitNew.addAll(fruit);

        // or using Clone():
        ArrayList<String> fruitNew2 = (ArrayList) fruit.clone();

        System.out.println(fruitNew);
        System.out.println(fruitNew2);
        
        String dorian = "Dorian";

    }
}
