import java.util.Scanner;

public class AscendingOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.println("Enter the third number: ");
        int num3 = scanner.nextInt();
        int theBiggestNumber = Math.max(Math.max(num1, num2), num3);
        int theSmallestNumber = Math.min(Math.min(num1, num2), num3);
        int sum = num1 + num2 + num3;
        int theMiddleNumber = sum - theSmallestNumber - theBiggestNumber;
        System.out.println("The ascending order of numbers is: " + theSmallestNumber + " " + theMiddleNumber + " " + theBiggestNumber);
    }
}
