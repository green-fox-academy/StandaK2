// Write a program that asks for two numbers
// The first number represents the number of girls that comes to a party, the
// second the boys
// It should print: The party is excellent!
// If the the number of girls and boys are equal and 20 or more people are coming to the party
//
// It should print: Quite cool party!
// If there are 20 or more people coming to the party but the girl - boy ratio is not 1-1
//
// It should print: Average party...
// If there are less people coming than 20
//
// It should print: Sausage party
// If no girls are coming, regardless the count of the people

import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of girls:");
        int girls = scanner.nextInt();
        System.out.println("Enter number of boys:");
        int boys = scanner.nextInt();

        boolean sausageParty = girls < 1;
        boolean averageParty = (girls + boys) < 20;
        boolean quiteCoolParty = girls + boys >= 20 && girls / boys != 1;
        boolean excellentParty = girls + boys >= 20 && girls / boys == 1;

        if (sausageParty) {
            System.out.println("Sausage party");
        }   else if (averageParty) {
            System.out.println("Average party");
        }   else if (quiteCoolParty) {
            System.out.println("Quite cool party");
        }   else if (excellentParty) {
            System.out.println("The party is excellent!");

        }
    }
}