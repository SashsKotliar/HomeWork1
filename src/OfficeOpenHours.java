import java.util.Scanner;

public class OfficeOpenHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! On which day would you like to come?");
        int day = scanner.nextInt();
        notAllowedDay(day);
        weekend(day);
        regularDay(day);
        thursday(day);
    }

    public static void notAllowedDay(int day) {
        if (day > 7 || day < 1) {
            System.out.println("The day you wished does not exist.");
        }
    }

    public static void weekend(int day) {
        if (day == 6 || day == 7) {
            System.out.println("The office is closed on weekend.");
        }
    }

    public static void regularDay(int day) {
        if (day >= 1 && day <= 5 && day != 3) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the earliest hour you could arrive: ");
            int theEarliestArrivalTime = scanner.nextInt();
            System.out.println("Enter the latest hour you could arrive: ");
            int theLatestArrivalTime = scanner.nextInt();
            if (theLatestArrivalTime > 23 || theLatestArrivalTime < 0) {
                System.out.println("The hour you wished does not exist");
            }
            if (theEarliestArrivalTime > 23 || theEarliestArrivalTime < 0) {
                System.out.println("The hour you wished does not exist");
            }
            if (theEarliestArrivalTime > theLatestArrivalTime) {
                System.out.println("Mistake");
            }
            if (theEarliestArrivalTime <= theLatestArrivalTime) {
                if (theEarliestArrivalTime >= 9 && theEarliestArrivalTime <= 17) {
                    if (theLatestArrivalTime <= 17) {
                        System.out.print("Great! We are waiting you on the day you choose. See you soon!");
                    } else {
                        if (day == 1) {
                            System.out.println("The opening hours on Sunday are 9:00 - 17:00");
                        }
                        if (day == 2) {
                            System.out.println("The opening hours on Monday are 9:00 - 17:00");
                        }
                        if (day == 4) {
                            System.out.println("The opening hours on Wednesday are 9:00 - 17:00");
                        }
                        if (day == 5) {
                            System.out.println("The opening hours on Thursday are 9:00 - 17:00");
                        }
                    }
                } else {
                    if (day == 1) {
                        System.out.println("The opening hours on Sunday are 9:00 - 17:00");
                    }
                    if (day == 2) {
                        System.out.println("The opening hours on Monday are 9:00 - 17:00");
                    }
                    if (day == 4) {
                        System.out.println("The opening hours on Wednesday are 9:00 - 17:00");
                    }
                    if (day == 5) {
                        System.out.println("The opening hours on Thursday are 9:00 - 17:00");
                    }
                }
            }
        }
    }

    public static void thursday(int day) {
        if (day == 3) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the earliest hour you could arrive: ");
            int theEarliestArrivalTime = scanner.nextInt();
            System.out.println("Enter the latest hour you could arrive: ");
            int theLatestArrivalTime = scanner.nextInt();
            if (theLatestArrivalTime > 23 || theLatestArrivalTime < 0) {
                System.out.println("The hour you wished does not exist");
            }
            if (theEarliestArrivalTime > 23 || theEarliestArrivalTime < 0) {
                System.out.println("The hour you wished does not exist");
            }
            if (theEarliestArrivalTime > theLatestArrivalTime) {
                System.out.println("Mistake");
            }
            if (theEarliestArrivalTime <= theLatestArrivalTime) {
                if (theEarliestArrivalTime >= 8 && theEarliestArrivalTime <= 12) {
                    if (theLatestArrivalTime <= 12) {
                        System.out.print("Great! We are waiting you on Tuesday. See you soon!");
                    } else {
                        System.out.println("The opening hours on Tuesday are: 8:00 - 12:00 ");
                    }
                } else {
                    System.out.println("The opening hours on Tuesday are: 8:00 - 12:00");
                }
            }
        }
    }
}

