package julesnuggy.fizzbuzz;

public class FizzBuzz {

    public String calculate(int myNumber) {
        String myOutput;
        if ((myNumber % 3) == 0 && (myNumber % 5) != 0) {
            myOutput = "Fizz";
        }
        else if ((myNumber % 3) != 0 && (myNumber % 5) == 0) {
            myOutput = "Buzz";
        }
        else if ((myNumber % 3) == 0 && (myNumber % 5) == 0) {
            myOutput = "FizzBuzz";
        }
        else {
            myOutput = Integer.toString(myNumber);
        }

        return myOutput;
    }
}

