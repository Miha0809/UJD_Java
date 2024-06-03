import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    private static void Task1() {
        String input = "Hello, world!";
        IntStream codePointsStream = IntStream.iterate(0, i -> i + 1)
                                              .limit(input.length())
                                              .map(input::codePointAt);

        codePointsStream.forEach(item -> System.out.println(Integer.toHexString(item)));
    }
    
    private static void Task2() {
        System.out.println("Hello".codePoints()
                                  .allMatch(Character::isAlphabetic));
        System.out.println("Hello123".codePoints()
                                     .allMatch(Character::isAlphabetic));
        System.out.println("Hello123".codePoints()
                                     .skip(1)
                                     .allMatch(Character::isJavaIdentifierPart));
        System.out.println("123Hello".codePoints()
                                     .skip(1)
                                     .allMatch(Character::isJavaIdentifierPart));
        System.out.println("Hello_123".codePoints()
                                      .skip(1)
                                      .allMatch(Character::isJavaIdentifierPart));
        System.out.println("Hello-123".codePoints()
                                      .skip(1)
                                      .allMatch(Character::isJavaIdentifierPart));
    }
    
    private static void Task3() {

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int task = -1;

        while (task != 0) {
            System.out.println("\n\t\tNAVIGATION");
            System.out.println("Task 1 - enter 1");
            System.out.println("Task 2 - etner 2");
            System.out.println("Task 3 - etner 3");
            System.out.println("EXIT - etner 0");
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
                default:
                    break;
            }
        }
    }
}