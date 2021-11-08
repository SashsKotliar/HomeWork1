import java.util.Scanner;

public class PrimeNumbers {

    public static boolean division(int number, int counter) {

        boolean noRemainder;
        noRemainder = number % counter == 0;
        return noRemainder;

    }

    public static boolean primeNumberCheck(int number) {
        for (int counter = 2; counter < number; counter++) {
            if (division(number, counter)) {
                return false;
            }
        }
        return true;
    }

    public static int positiveNumber() {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("Please enter a positive number: ");
            number = scanner.nextInt();
        } while (number < 1);
        return number;
    }

    public static void main(String[] args) {
        int positiveNumber = positiveNumber();
        for (int counter = 2; counter < positiveNumber; counter++){
            boolean isPrime = primeNumberCheck(counter);
            if (isPrime) {
                System.out.println(counter);
            }
        }
    }
}
