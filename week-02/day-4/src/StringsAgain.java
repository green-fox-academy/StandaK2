//Given a string, compute recursively a new string where all the 'x' chars have been removed.

public class StringsAgain {
    public static void main(String[] args) {

        char from = 'x';
        System.out.println(RemoveX("xlkjxlkjxlxhxuyxutxxfgjgxx", from));
    }

    public static String RemoveX(String string, char from) {

        if (string.length() < 1) {
            return string;
        } else {
            char first = (string.charAt(0));
            if (first == from) {

                return RemoveX(string.substring(1), from);
            }
            return first + RemoveX(string.substring(1), from);
        }
    }
}
