import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;

public class MostCommonCharacters {

    public static void main(String[] args) {

        Path filepath = Paths.get("countchar.txt");
        HashMap<Character, Integer> letters = frequencyOfCharacters(filepath);
        System.out.println(mostCommonCharacters(letters));
    }


    public static HashMap<Character, Integer> frequencyOfCharacters(Path filepath) {

        HashMap<Character, Integer> letters = new HashMap<>();
        try {
            List<String> lines = Files.readAllLines(filepath);
            for (String line : lines) {
                for (int i = 0; i < line.length(); i++) {
                    if (letters.containsKey(line.charAt(i)) && line.charAt(i) != ' '){
                        letters.replace(line.charAt(i), letters.get(line.charAt(i)) + 1);
                    } else {
                        letters.put(line.charAt(i), 1);
                    }
                }
            }
        } catch (IOException error) {
            System.out.println("Can't open a file or file does not exist!.");
        }
        return letters;
    }


    public static HashMap<Character, Integer> mostCommonCharacters(HashMap<Character, Integer> hashMap) {

        int numberOfMostCommon = 2;
        HashMap<Character, Integer> mostCommon = new HashMap<>();

        for (int k = 0; k < numberOfMostCommon; k++) {
            int frequency = 0;
            char letter = ' ';
            for (Character i : hashMap.keySet()) {
                for (Character j : hashMap.keySet()) {
                    if (hashMap.get(i) > hashMap.get(j) && hashMap.get(i) > frequency) {
                        letter = i;
                        frequency = hashMap.get(i);
                    }
                }
            }
            hashMap.remove(letter);
            mostCommon.put(letter, frequency);
        }
        return mostCommon;
    }
}
