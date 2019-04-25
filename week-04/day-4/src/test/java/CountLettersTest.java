import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class CountLettersTest {


    @Test
    public void giveMeDictionary_givenString_toGetDictionary() {
        CountLetters countLetters = new CountLetters("anaconda");

        HashMap<Character, Integer> dictionary = new HashMap<>();
        dictionary.put('a', 3);
        dictionary.put('n', 2);
        dictionary.put('c', 1);
        dictionary.put('o', 1);
        dictionary.put('d', 1);

        assertEquals(dictionary, countLetters.giveMeDictionary());
    }

    @Test
    public void giveMeDictionary_givenStringWithCapitals_toPutAllToLowercase() {
        CountLetters countLetters = new CountLetters("AnacoNda");

        HashMap<Character, Integer> dictionary = new HashMap<>();
        dictionary.put('a', 3);
        dictionary.put('n', 2);
        dictionary.put('c', 1);
        dictionary.put('o', 1);
        dictionary.put('d', 1);

        assertEquals(dictionary, countLetters.giveMeDictionary());
    }

    @Test
    public void giveMeDictionary_givenStringWithSpaces_notToCountSpaces() {
        CountLetters countLetters = new CountLetters("Ana   co Nda");

        HashMap<Character, Integer> dictionary = new HashMap<>();
        dictionary.put('a', 3);
        dictionary.put('n', 2);
        dictionary.put('c', 1);
        dictionary.put('o', 1);
        dictionary.put('d', 1);

        assertEquals(dictionary, countLetters.giveMeDictionary());
    }

    @Test
    public void giveMeDictionary_givenEmptyString_toGetEmptyDictionary() {
        CountLetters countLetters = new CountLetters("");

        HashMap<Character, Integer> dictionary = new HashMap<>();

        assertEquals(dictionary, countLetters.giveMeDictionary());
    }
}
