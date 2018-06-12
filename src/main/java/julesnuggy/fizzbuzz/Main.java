package julesnuggy.fizzbuzz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        FizzBuzz fb = new FizzBuzz();
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the number to run FizzBuzz up to: ");
        int maxNumber = userInput.nextInt();
        System.out.print("Do you want to implement rule 3 (true/false)? ");
        Boolean rule3 = userInput.nextBoolean();
        System.out.print("Do you want to implement rule 5 (true/false)? ");
        Boolean rule5 = userInput.nextBoolean();
        System.out.print("Do you want to implement rule 7 (true/false)? ");
        Boolean rule7 = userInput.nextBoolean();
        System.out.print("Do you want to implement rule 11 (true/false)? ");
        Boolean rule11 = userInput.nextBoolean();
        System.out.print("Do you want to implement rule 13 (true/false)? ");
        Boolean rule13 = userInput.nextBoolean();
        System.out.print("Do you want to implement rule 17 (true/false)? ");
        Boolean rule17 = userInput.nextBoolean();

        for (int i=1; i<=maxNumber; i++) {
            System.out.println(fb.runFizzBuzz(i, rule3, rule5, rule7, rule11, rule13, rule17));
        }
    }
}
