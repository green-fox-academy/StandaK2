// Write a program that reads a number from the standard input, then draws a
// diamond like this:
//
//
//    *
//   ***
//  *****
// *******
//  *****
//   ***
//    *
//
// The diamond should have as many lines as the number was

import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer number:");
        int lines = scanner.nextInt();
        int middleHeight = lines / 2;

        String star = "*";
        String space = " ";
        int middleWidth = lines / 2;

        for (int row = 0; row <= middleHeight; row++) {
            for (int column = 0; column < lines; column++) {
                if (column < middleWidth - row || column > middleWidth + row) {
                    System.out.print(space);
                } else {
                    System.out.print(star);
                }
            }
            System.out.println();
        }
        int k = 1;
        for (int row = middleHeight + 1; row < lines; row++) {
            for (int colums = 0; colums < lines; colums++) {
                if (colums < (lines - k) && colums >= k) {
                    System.out.print(star);
                } else {
                    System.out.print(space);
                }
            }

            k += 1;
            System.out.println();
        }
    }
}
