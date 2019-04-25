import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by aze on 2017.04.04..
 */
public class Extension {

    int add(int a, int b) {
        return a + b;
    }

    public int maxOfThree(int a, int b, int c) {
        return Math.max(Math.max(a, b), Math.max(b, c));
    }

    double median(List<Integer> pool) {
        Collections.sort(pool);
        if (pool.size() % 2 != 0) {
            return (double) pool.get(pool.size() / 2);
        } else {
            return ((double) pool.get(pool.size() / 2 - 1) + (double) pool.get(pool.size() / 2)) / 2;
        }
    }

    boolean isVowel(char c) {
        return Arrays.asList('a', 'u', 'o', 'e', 'i').contains(c);
    }

    String translate(String hungarian) {
        int length = hungarian.length();
        for (int i = 0; i < length - 1; i++) {
            char c = hungarian.charAt(i);
            if (isVowel(c)) {
                System.out.println(hungarian);
                hungarian = String.join(c + "v" + c, hungarian.split("" + c));
                i += 2;
                length += 2;
            }
        }
        return hungarian;
    }
}