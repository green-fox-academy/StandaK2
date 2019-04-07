// Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%
// %%  %
// % % %
// %  %%
// %%%%%
//
// The square should have as many lines as the number was

import java.util.Scanner;

public class DrawDiagonal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer number as a square side: ");
        int side = scanner.nextInt();
        String sign = "X";
        String space = " ";

        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                if (i == 0 || i == side - 1) {
                    System.out.print(sign);
                } else if (j == 0 || j == side - 1 || j == i) {
                    System.out.print(sign);
                } else {
                    System.out.print(space);
                }
            }
            System.out.println();
        }

    }
}
