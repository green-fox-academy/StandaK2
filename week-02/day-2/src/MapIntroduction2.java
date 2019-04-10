/*



        Add the following key-value pairs to the map

        Key	Value
        978-1-60309-450-4	They Called Us Enemy
        978-1-60309-453-5	Why Did We Trust Him?
        Print whether there is an associated value with key 478-0-61159-424-8 or not

        Print the value associated with key 978-1-60309-453-5*/

import java.util.HashMap;
import java.util.Map;

public class MapIntroduction2 {
    public static void main(String[] args) {

        /*
        Create a map where the keys are strings and the values are strings with the following initial values
        */
        HashMap<String, String> isbn = new HashMap<>();

        isbn.put("978-1-60309-452-8", "A Letter to Jo");
        isbn.put("978-1-60309-459-7", "Lupus");
        isbn.put("978-1-60309-444-3", "Red Panda and Mood Bear");
        isbn.put("978-1-60309-461-0", "The Lab");

        /*
        Print all the key-value pairs in the following format

        A Letter to Jo (ISBN: 978-1-60309-452-8)
        Lupus (ISBN: 978-1-60309-459-7)
        Red Panda and Moon Bear (ISBN: 978-1-60309-444-3)
        The Lab (ISBN: 978-1-60309-461-0)
        Remove the key-value pair with key 978-1-60309-444-3
*/
        for (String key : isbn.keySet()) {
            System.out.println(isbn.get(key) + " (ISBN: " + key + ")");
        }

//        Remove the key-value pair with value The Lab
        String lab = "The Lab";
        System.out.println(isbn);

        for (Map.Entry <String, String> value : isbn.entrySet()) {
            if (value.getValue() == lab) {
                String key = value.getKey();
                isbn.remove(key);
            }
        } System.out.println(isbn);
    }
}
