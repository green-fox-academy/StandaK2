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
        int number = scanner.nextInt();

        String star = "";
        String space = " ";

        String star = "";
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
            

        for (int i = 0; i < number; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }




    }
}
