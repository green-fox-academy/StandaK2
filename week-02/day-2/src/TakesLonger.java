
public class TakesLonger {
    public static void main(String[] args) {
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
        String newString = "always takes longer than ";
        String sepWord = "It ";
        StringBuilder newQuoteBuild = new StringBuilder(quote);

        int index = newQuoteBuild.indexOf(sepWord);
        newQuoteBuild.insert(index + sepWord.length(), newString);
        System.out.println(newQuoteBuild);


        System.out.println("--------   METHOD WITHOUT STRINGBUILDER  -----------");

        // When saving this quote a disk error has occured. Please fix it.
        // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
        // Using pieces of the quote variable (instead of just redefining the string)

        String[] quoteSplitted = quote.split(" ");
        String newWord = "always takes longer than";
        String it = "It";

        String newQuote = "";
        for (int i = 0; i < quoteSplitted.length; i++) {
            if (quoteSplitted[i].equals(it)) {
                quoteSplitted[i] = it + " " + newWord;
            }
            newQuote += (quoteSplitted[i] + " ");
        }
        System.out.println(newQuote);
    }
}