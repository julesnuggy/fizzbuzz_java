package julesnuggy.fizzbuzz;

public class Main {

    public static void main(String[] args) {
        FizzBuzz fb = new FizzBuzz();
        for (int i=1; i<=255; i++) {
            System.out.println(fb.runFizzBuzz(i));
        }
    }
}
