package julesnuggy.fizzbuzz;

public class FizzBuzz {

    public String calculate(int myNumber) {
        String myOutput;
        if ((myNumber % 3) == 0) {
            myOutput = "Fizz";
        }
        else if ((myNumber % 5) == 0) {
            myOutput = "Buzz";
        }
        else {
            myOutput = Integer.toString(myNumber);
        }

        return myOutput;
    }
}

