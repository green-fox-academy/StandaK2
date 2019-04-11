// Given a string, compute recursively a new string where all the adjacent chars are now separated by a *

public class StringsAgainAgain {
    public static void main(String[] args) {

        String separator = "*";
        System.out.println(Adjacent("You are so funny", separator));
    }

    public static String Adjacent(String string, String separator) {

        if (string.length() < 2) {
            return string;
        } else {
            char first = string.charAt(0);
            char second = string.charAt(1);

            if (first != ' ' && (second != ' ')) {
                return (first + separator + Adjacent(string.substring(1), separator));
            }
            return first + Adjacent(string.substring(1), separator);

        }
    }
}
