import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {


    @Test
    public void getFibonnaciNumber_givenIndexNumber_toGetFibonnaciNumber() {

        Fibonacci fibonacci = new Fibonacci();
        int result = 55; //for n=10 F=55

        assertEquals(result, fibonacci.getFibonacciNumber(10));
    }

    @Test
    public void getFibonnaciNumber_givenZero_toGetZero() {

        Fibonacci fibonacci = new Fibonacci();
        int result = 0;

        assertEquals(result, fibonacci.getFibonacciNumber(0));
    }

    @Test
    public void getFibonnaciNumber_bigInt_toGetZero() {

        Fibonacci fibonacci = new Fibonacci();
        int result = 6765;

        assertEquals(result, fibonacci.getFibonacciNumber(20));
    }
}
