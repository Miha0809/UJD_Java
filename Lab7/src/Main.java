import java.util.List;
import java.util.Scanner;
import java.util.Optional;
import java.util.Map;
import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
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

    private static void Task1() {
        List<Person> people = Arrays.asList(
                new Person("Alice", 30, Optional.of("alice@example.com")),
                new Person("Bob", 30, Optional.empty()),
                new Person("Charlie", 25, Optional.of("charlie@example.com")),
                new Person("David", 25, Optional.of("david@example.com")),
                new Person("Eve", 35, Optional.empty())
        );

        Map<Integer, List<String>> emailsByAge = people.stream()
                .collect(Collectors.groupingBy(
                        Person::getAge,
                        Collectors.flatMapping(
                                person -> person.getEmail().stream(),
                                Collectors.toList()
                        )
                ));

        System.out.println(emailsByAge);
    }

    private static <T> boolean isFinite(Stream<T> stream) {
        try {
            Iterator<T> iterator = stream.iterator();
            long count = 0;
            while (iterator.hasNext()) {
                iterator.next();
                count++;
                if (count > Long.MAX_VALUE - 1) {
                    return false;
                }
            }
            return true;
        } catch (OutOfMemoryError | StackOverflowError e) {
            return false;
        } catch (Exception e) {
            return false;
        }
    }
    private static void Task2() {
        Stream<Integer> finiteStream = Stream.of(1, 2, 3, 4, 5);
        Stream<Integer> infiniteStream = Stream.iterate(0, n -> n + 1);

        System.out.println(isFinite(finiteStream));
        System.out.println(isFinite(infiniteStream));
    }

    private static void Task3() {

    }
}