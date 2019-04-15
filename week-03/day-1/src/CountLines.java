// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class CountLines {
    public static void main(String[] args) {

        Path filepath = Paths.get("my-file.txt");
        System.out.println(NumberOfLines(filepath));
    }

    public static int NumberOfLines(Path filepath) {
        try {
            List<String> lines = Files.readAllLines(filepath);
            return lines.size();
        } catch (IOException error) {
            System.out.println("Can't open a file.");
            return 0;
        }
    }
}
