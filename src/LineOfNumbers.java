import java.util.Scanner;

public class LineOfNumbers {
    public static void function1(int firstElement, int difference, int numberOfElements) {
        int count = 0;
        for (int i = 0; i < numberOfElements; i++) {
            System.out.print(firstElement + count + ",");
            count = count + difference;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first element: ");
        int firstElement = scanner.nextInt();
        System.out.println("Enter the difference between elements: ");
        int difference = scanner.nextInt();
        System.out.println("Enter the number of elements: ");
        int numberOfElements = scanner.nextInt();
        function1(firstElement, difference, numberOfElements);
    }
}
