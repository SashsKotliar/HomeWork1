import java.util.Scanner;

public class StarRows {
    public static int numberOfRows() {
        int rowsNumber;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number between 5 and 20");
            rowsNumber = scanner.nextInt();
        }
        while (rowsNumber < 5 || rowsNumber > 20);
        return rowsNumber;
    }

    public static void buildingStarStairs(int rowsNumber) {
        int i, j;
        for (i = 0; i < rowsNumber; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int rowsNumber = numberOfRows();
        buildingStarStairs(rowsNumber);
    }
}

