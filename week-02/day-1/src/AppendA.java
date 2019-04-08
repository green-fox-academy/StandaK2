// - Create an array variable named `animals`
//   with the following content: `["koal", "pand", "zebr"]`
// - Add all elements an `"a"` at the end

public class AppendA {
    public static void main(String[] args) {
        String[] animals = {"koal", "pand", "zebr"};
        String letter = "a";

        for (int i = 0; i < animals.length; i++) {
            animals[i] += letter;
            System.out.println(animals[i]);
        }
    }
}
