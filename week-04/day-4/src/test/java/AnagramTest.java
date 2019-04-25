import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AnagramTest {

    @Test
    public void areWordsAnagrams_givenTwoStrings_toGetBooleanIfAnagrams() {

        Anagram myAnagram = new Anagram("listen", "silent");

        assertEquals(true, myAnagram.areWordsAnagrams());
       // assertTrue(myAnagram.areWordsAnagrams());
    }

    @Test
    public void areWordsAnagrams_givenTwoStringsWithCapitals_toGetBooleanIfAnagrams() {

        Anagram myAnagram = new Anagram("Listen", "silent");

        assertEquals(true, myAnagram.areWordsAnagrams());
        // assertTrue(myAnagram.areWordsAnagrams());
    }

    @Test
    public void areWordsAnagrams_givenTwoStringsWithSpaces_toGetBooleanIfAnagrams() {

        Anagram myAnagram = new Anagram("School master", "The classroom");

        assertEquals(true, myAnagram.areWordsAnagrams());
        // assertTrue(myAnagram.areWordsAnagrams());
    }

    @Test
    public void areWordsAnagrams_givenEmptyStringAndLetterA_toGetBooleanFalse() {

        Anagram myAnagram = new Anagram("", "A");

        assertEquals(false, myAnagram.areWordsAnagrams());
        // assertTrue(myAnagram.areWordsAnagrams());
    }
}