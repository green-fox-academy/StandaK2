// Given a string, compute recursively (no loops) a new string where all the lowercase 'x' chars
// have been changed to 'y' chars.

public class Strings {
    public static void main(String[] args) {

        char To = 'y';
        char From = 'x';
        System.out.println(ChangeXtoY("xlkjxlkjx", From, To));
    }

    public static String ChangeXtoY(String string, char from, char to) {

        if (string.length() < 1) {
            return string;
        } else {
            char first = (string.charAt(0));
            if (first == from) {
                first = to;
            }
            return first + ChangeXtoY(string.substring(1), from, to);
        }
    }
}
