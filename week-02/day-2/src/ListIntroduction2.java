
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

//        Print out whether List A contains Durian or not

        String durian = "Durian";
        System.out.println(fruit.contains(durian));

//       Remove Durian from List B
        fruitNew.remove(durian);

//        Add Kiwifruit to List A after the 4th element
        String kiwi = "Kiwifruit";
        fruit.add(4, kiwi);

//        Compare the size of List A and List B
        System.out.println(fruit.equals(fruitNew));

//        Get the index of Avocado from List A
        String avocado = "Avocado";
        System.out.println(fruit.indexOf(avocado));

//        Get the index of Durian from List B
        System.out.println(fruitNew);
        System.out.println(fruitNew.indexOf(durian));

        //    Add Passion Fruit and Pummelo to List B in a single statement
        fruitNew.addAll(0, Arrays.asList("Passion Fruit", "Pummelo"));
        System.out.println(fruitNew);

//        Print out the 3rd element from List A
        System.out.println(fruit.get(2));
    }
}
