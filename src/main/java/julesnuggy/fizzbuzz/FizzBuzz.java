package julesnuggy.fizzbuzz;

public class FizzBuzz {
    public String assessNumber(int inputNumber, int assessNumber, String outputString) {
        if (inputNumber % assessNumber == 0) {
            return outputString;
        }
        else {
            return "";
        }
    }

    public String runFizzBuzz(int inputNumber) {
        String finalOutput = "";

        finalOutput += this.assessNumber(inputNumber, 3, "Fizz");
        finalOutput += this.assessNumber(inputNumber, 5, "Buzz");
        finalOutput += this.assessNumber(inputNumber, 7, "Bang");

        if (inputNumber % 11 == 0) {
            finalOutput = this.assessNumber(inputNumber, 11, "Bong");
        }

        if (finalOutput.length() == 0) {
            finalOutput = Integer.toString(inputNumber);
        }

        return finalOutput;
    }
}

