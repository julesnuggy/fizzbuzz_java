package julesnuggy.fizzbuzz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        FizzBuzz fb = new FizzBuzz();
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the number to run FizzBuzz up to: ");
        int maxNumber = userInput.nextInt();

        for (int i=1; i<=maxNumber; i++) {
            System.out.println(fb.runFizzBuzz(i));
        }
    }
}
