import java.util.HashMap;

public class CountLetters {

    String word;

    public CountLetters(String word) {
        this.word = word.toLowerCase().replaceAll(" ", "");
    }

    public HashMap<Character, Integer> giveMeDictionary(){

        HashMap<Character, Integer> dictionary = new HashMap<>();

        for (int i = 0; i < this.word.length(); i++) {
            if (dictionary.containsKey(this.word.charAt(i))){
                dictionary.replace(this.word.charAt(i), dictionary.get(this.word.charAt(i)) + 1);
            } else {
                dictionary.put(this.word.charAt(i), 1);
            }
        }
        return dictionary;
    }
}