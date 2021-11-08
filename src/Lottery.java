import java.util.Random;
import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        Random random = new Random();
        int luckyNumber = random.nextInt(1000) + 1;
        System.out.println(luckyNumber);
        int num1, num2;
        int counter1 = 1;
        int counter2 = 1;

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Player one, please enter your number");
            num1 = scanner.nextInt();
            if (num1 == luckyNumber) {
                System.out.println("CONGRATULATIONS! Player one won after " + counter1 + " tries");
                break;
            }
            if (num1 > luckyNumber) {
                System.out.println("Your number is bigger than a lucky number.");
            } else {
                System.out.println("Your number is smaller than a lucky number.");
            }
            counter1 ++;

            System.out.println("Player two, please enter the number: ");
            num2 = scanner.nextInt();
            if (num2 == luckyNumber) {
                System.out.println("CONGRATULATIONS! Player two won after " + counter2 + " tries");
                break;
            }
            if (num2 > luckyNumber) {
                    System.out.println("Your number is bigger than a lucky number.");
            } else {
                System.out.println("Your number is smaller than a lucky number.");
            }
            counter2 ++;
        } while (luckyNumber != num1 && luckyNumber != num2);
    }
}
