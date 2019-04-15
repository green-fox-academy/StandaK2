// Write a function that copies the contents of a file into another
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;

public class CopyFile {
    public static void main(String[] args) {

        Path sourceFilePath = Paths.get("multilines.txt");
        Path newFilePath = Paths.get("multilines_copy.txt");
        if (CopyFile(sourceFilePath, newFilePath)){
            System.out.println("Copy of file was succesfully created");
        }
    }
    public static boolean CopyFile(Path sourceFilePath, Path newFilePath){

        try {
            Files.copy(sourceFilePath, newFilePath);
            return true;
        } catch(IOException error){
            System.out.println("Can't open or write to a file.");
            return false;
        }
    }
}
