package julesnuggy.fizzbuzz;

public class Main {

    public static void main(String[] args) {
        FizzBuzz fb = new FizzBuzz();
        for (int i=1; i<=105; i++) {
            System.out.println(fb.calculateExtra(i));
        }
    }
}
