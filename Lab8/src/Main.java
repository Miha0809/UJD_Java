import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static void Task1() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        double average = numbers.stream()
                                .mapToInt(Integer::intValue)
                                .average()
                                .orElse(0);

        System.out.println(average);
    }

    private static void Task2() {}

    private static void Task3() {}

    private static void Task4() {}

    private static void Task5() {}

    private static void Task6() {}

    private static void Task7() {}

    private static void Task8() {}

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
            System.out.println("Task 7 - enter 7");
            System.out.println("Task 8 - enter 8");
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
                case 7: {
                    Task7();
                    break;
                }
                case 8: {
                    Task8();
                    break;
                }
                default:
                    break;
            }
        }
    }
    }
}