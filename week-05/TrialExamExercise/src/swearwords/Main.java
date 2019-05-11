package swearwords;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String[] badWords = {"bloody", "fuck", "cock", "shit", "fucker", "fuckstick", "asshole", "dick", "piss", "cunt"};
//        frequency:            4,      2,      2,      1,          1,      2,          2,          2,      1,      1

        String fileName = "content.txt";

        Path path = Paths.get(fileName);
        System.out.println(clearContentandCount(badWords, contentFromFile(path)));

    }

    public static int clearContentandCount(String[] badWords, String content) {

        int count = 0;

        for (String badWord : badWords) {

            while (content.contains(" " + badWord + " ")) {
                content = content.replaceFirst(" " + badWord + " ", " ");
                count++;
            }

            String badWordUpper = (badWord.substring(0, 1).toUpperCase() + badWord.substring(1));
            while (content.contains((" " + badWordUpper + " "))) {
                content = content.replaceFirst(" " + badWordUpper + " ", " ");
                count++;
            }
            while (content.contains(" " + badWord + ". ")) {
                content = content.replaceFirst(" " + badWord + ". ", ". ");
                count++;
            }
            while (content.contains(" " + badWord + ", ")) {
                content = content.replaceFirst(" " + badWord + ", ", ", ");
                count++;
            }
        }
        return count;

    }

    public static String contentFromFile(Path file) {
        String wholeContent = "";
        try {
            List<String> content = Files.readAllLines(file);
            for (String line : content) {
                wholeContent += line;
            }
        } catch (IOException error) {
            System.out.println("Not able to read file.");
        }
        return wholeContent;
    }
}
