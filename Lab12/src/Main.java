import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    private static void Task1() {
        int year = 2024;

        LocalDate programmersDay = LocalDate.of(year, 1, 1).plusDays(255);

        System.out.println("Dzień Programisty w roku " + year + " to: " + programmersDay);
    }

    private static void Task2() {
        LocalDate date = LocalDate.of(2000, 2, 29);
        LocalDate nextYear = date.plusYears(1);
        System.out.println("Data po dodaniu jednego roku: " + nextYear);
    }

    private static void Task3() {}

    private static void Task4() {}

    private static void Task5() {}

    private static void Task6() {}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int task = -1;

        while (task != 0) {
            System.out.println("\n\t\tNAVIGATION");
            System.out.println("Task 1 - enter 1");
            System.out.println("Task 2 - enter 2");
            System.out.println("Task 3 - enter 3");
            System.out.println("Task 4 - enter 4");
            System.out.println("Task 5 - enter 5");
            System.out.println("Task 6 - enter 6");
            System.out.println("EXIT - enter 0");
            task = scanner.nextInt();

            switch (task) {
                case 1: {
                    Task1();
                    break;
                }
                case 2: {
                    Task2();
                    break;
                }
                case 3: {
                    Task3();
                    break;
                }
                case 4: {
                    Task4();
                    break;
                }
                case 5: {
                    Task5();
                    break;
                }
                case 6: {
                    Task6();
                    break;
                }
                default:
                    scanner.close();
                    break;
            }
        }

    }
}