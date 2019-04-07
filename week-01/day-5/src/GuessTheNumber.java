// Write a program that stores a number, and the user has to figure it out.
// The user can input guesses, after each guess the program would tell one
// of the following:
//
// The stored number is higher
// The stried number is lower
// You found the number: 8

import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int lowInterval = 1;
        int highInterval = 50;

        System.out.println("Want to play a guess game? Tell me a number I am thinking about ("
                + lowInterval + " - " + highInterval + "): ");
        int inputNumber = 0;
        Random random = new Random();
        // Obtain a number between [0 - highInterval].
        int guessNumber = random.nextInt(highInterval) + 1;

        while (inputNumber != guessNumber) {
            inputNumber = scanner.nextInt();
            if (inputNumber < lowInterval || inputNumber > highInterval) {
                System.out.println("Only numbers between " + lowInterval + " and " + highInterval + ", try it again:");
            } else if (inputNumber < guessNumber) {
                System.out.println("Try again but higher number:");
            } else if (inputNumber > guessNumber) {
                System.out.println("Try again but lower number:");
            }
        }
        System.out.println("Perfect guess!!! You got it! Congratulations. :-) ");
    }
}