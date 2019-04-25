import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class AppleTest {

    @Test
    public void Apple_getApple_returnsStringApple() {
        Apple myApple = new Apple();

        assertEquals("apple", myApple.getApple());

    }
}
