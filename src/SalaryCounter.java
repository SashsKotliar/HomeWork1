import java.util.Scanner;

public class SalaryCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Start");
        int worker, workHours, bonusDays;
        do {
            System.out.println("Please enter the type of worker 0 or 1: ");
            // 0 - עובד זוטר, 1 - עובד בכיר
            worker = scanner.nextInt();
            if (worker == 1 || worker == 0) {
                do{
                   System.out.println("Please enter the number of hours he worked: ");
                   workHours = scanner.nextInt();
                } while (workHours < 0);
                do {
                    System.out.println("Please enter the number of days the worker got a bonus: ");
                    bonusDays = scanner.nextInt();
                } while (bonusDays < 0);
                 workersSalaryCounter(worker, workHours, bonusDays);
                System.out.println("If you want to stop now, enter any number except 0 and 1: ");
            }
            else {
                System.out.println("Finish");
            }
        } while (worker == 1 || worker == 0);
    }

    public static void workersSalaryCounter(int worker, int workHours, int bonusDays) {
        int salaryPerHour0 = 50;
        int salaryPerHour1 = 200;
        int bonus = 250;
        int theSalary0 = (salaryPerHour0 * workHours) + (bonusDays * bonus);
        int theSalary1 = (salaryPerHour1 * workHours) + (bonusDays * bonus);
        if (worker == 0) {
            System.out.println("This worker's salary is: " + theSalary0);
        }
        if (worker == 1) {
            System.out.println("This worker's salary is: " + theSalary1);
        }
    }
}
