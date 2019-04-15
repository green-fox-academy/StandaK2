// Write a function that is able to manipulate a file
// By writing your name into it as a single line
// The file should be named "my-file.txt"
// In case the program is unable to write the file,
// It should print the following error message: "Unable to write file: my-file.txt"

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;

public class WriteSingleLine {
    public static void main(String[] args) {

        Path filepath = Paths.get("my-file.txt");
        String content = "Standa Koumar";
        OneLineFile(filepath, content);
    }

    public static void OneLineFile(Path filepath, String content) {

        ArrayList<String> fileContent = new ArrayList<>();
        fileContent.add(content);
        try {
            Files.write(filepath, fileContent);
        } catch (IOException error) {
            System.out.println("Unable to write file: " + filepath);
        }
    }
}
