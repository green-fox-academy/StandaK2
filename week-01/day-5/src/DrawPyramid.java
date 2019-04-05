// Write a program that reads a number from the standard input, then draws a
// pyramid like this:
//
//
//    *
//   ***
//  *****
// *******
//
// The pyramid should have as many lines as the number was

import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer number:");
        int lines = scanner.nextInt();

        String star = "*";
        String space = " ";
        int width = lines * 2;
        int middle = width / 2;

        for (int row = 0; row < lines; row++) {
            for (int column = 0; column < width; column++) {
                if (column < middle - row || column > middle + row) {
                    System.out.print(space);
                }
                else {
                    System.out.print(star);
                }
            }
            System.out.println("");
        }
    }
}
