package julesnuggy.fizzbuzz;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        FizzBuzz fb = new FizzBuzz();
        String rulesToUseString;

        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the number to run FizzBuzz up to: ");
        int maxNumber = userInput.nextInt();
        System.out.print("Do you wish to use a custom-defined set of rules (Y/N)?");
        String customRules = userInput.next();

        if (customRules.toUpperCase().equals("Y")) {
            System.out.print("State which rules do you wish to apply - use a non-spaced, comma-separated list (e.g. 3,5,17): ");
            rulesToUseString = userInput.next();
        } else {
            rulesToUseString = "3,5,7,11,13,17";
            System.out.println("Using all rules for FizzBuzz: " + rulesToUseString);
        }

        String rulesStringSplit[] = rulesToUseString.split(",");
        List<Integer> rulesToUseArray = new LinkedList<>();
        for(String rules : rulesStringSplit) {
            rulesToUseArray.add(Integer.parseInt(rules));
        }

        for (int i=1; i<=maxNumber; i++) {
            System.out.println(fb.runFizzBuzz(i, rulesToUseArray));
        }
    }

}
