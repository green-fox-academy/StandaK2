// Write a function that takes a filename as a parameter
// The file contains an ended Tic-Tac-Toe match
// We have provided you some example files (draw.txt, win-x.txt, win-o.txt)
// Return "X", "O" or "Draw" based on the input file

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TicTacToe {

    public static void main(String[] args) {



        System.out.println(ticTacResult("win-o.txt"));
        // Should print "O"

        System.out.println(ticTacResult("win-x.txt"));
        // Should print "X"

        System.out.println(ticTacResult("draw.txt"));
        // Should print "Draw"
    }

    public static String ticTacResult (String filename){

        String stoneWins = "OOO";
        String crossWins = "XXX";

        try {
            Path file = Paths.get(filename);
            List<String> ticTacToe = Files.readAllLines(file);

            for (String row : ticTacToe) {
                if (row.equals(stoneWins)) {
                        return ("O");
                    } else if (row.equals(crossWins)){
                        return ("X");
                    } else{

                    }
                }return("Draw");

            } catch(IOException error){
            return ("Can't open file.");
            }

    }
}
