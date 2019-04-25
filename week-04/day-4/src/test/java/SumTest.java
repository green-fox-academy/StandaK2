import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class SumTest {

    @Test
    public void sumOfNumbers_givenListOfInteger_toGetSumOfNumbersInGivenList() {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        Sum mySum = new Sum(numbers);

        assertEquals(15, mySum.sumOfNumbers(numbers));
    }

    @Test
    public void sumOfNumbers_givenEmptyList_toGetZero() {

        ArrayList<Integer> numbers = new ArrayList<>();

        Sum mySum = new Sum(numbers);

        assertEquals(0, mySum.sumOfNumbers(numbers));
    }

    @Test
    public void sumOfNumbers_givenListWithOneInteger_toGetGivenInteger() {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);

        Sum mySum = new Sum(numbers);

        assertEquals(5, mySum.sumOfNumbers(numbers));
    }

    @Test
    public void sumOfNumbers_givenNoList_toGetNull() {

        ArrayList<Integer> numbers = null;

        Sum mySum = new Sum(numbers);

        assertEquals(null, mySum.sumOfNumbers(numbers));
    }
}