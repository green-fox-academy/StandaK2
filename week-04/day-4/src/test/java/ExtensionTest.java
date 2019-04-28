import java.util.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by aze on 2017.04.04..
 */
public class ExtensionTest {

    Extension extension = new Extension();

    @Test
    public void testAdd_givenTwoNumbers_toGetSum() {
        assertEquals(13, extension.add(6, 7));
    }

    @Test
    public void testAdd_givenTwoNegativeNumbers_toGetSum() {
        assertEquals(-13, extension.add(-6, -7));
    }

    @Test
    public void testAdd_givenOneNegativeNumber_toGetSum() {
        assertEquals(-1, extension.add(6, -7));
    }

    @Test
    public void testMaxOfThree_first() {
        assertEquals(15, extension.maxOfThree(15, 8, 0));
    }

    @Test
    public void testMaxOfThree_second() {
        assertEquals(15, extension.maxOfThree(8, 15, 0));
    }

    @Test
    public void testMaxOfThree_third() {
        assertEquals(15, extension.maxOfThree(6, 1, 15));
    }

    @Test
    public void testMedian_four_toGetAritmeticAverageOfTwoMiddleNumbersOfSortedList() {
        assertEquals(2.5, extension.median(Arrays.asList(1,3,4,2)), 0.01);
    }

    @Test
    public void testMedian_five_toGetMiddleofSortList() {
        assertEquals(3, extension.median(Arrays.asList(5,2,4,3,1)), 0.01);
    }

    @Test
    public void testIsVowel_space() {
        assertFalse(extension.isVowel(' '));
    }

    @Test
    public void testIsVowel_i() {
        assertTrue(extension.isVowel('i'));
    }

    @Test
    public void testTranslate_bemutatkozik() {
        assertEquals("stavand", extension.translate("standa"));
    }

    @Test
    public void testTranslate_lagopus() {
        assertEquals("lavagovopuvus", extension.translate("lagopus"));
    }
    @Test
    public void testTranslate_emptyString() {
        assertEquals("", extension.translate(""));
    }
}