import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ax2 + bx +cx = 0. Enter a, b, and c: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int b1 = b * b;
        int D = b1 - (4 * a * c);
        double answer1 = (-b - Math.sqrt(D)) / (2 * a);
        double answer2 = (-b + Math.sqrt(D)) / (2 * a);
        if (D > 0) {
            System.out.println("There are two answers: ");
            System.out.println(answer1);
            System.out.println(answer2);
        } else {
            if (D == 0) {
                System.out.println("There is one answer: ");
                System.out.println(answer1);
            } else {
                System.out.println("The is no answer");

            }
        }
    }
}
