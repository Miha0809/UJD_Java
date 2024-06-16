import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Scanner;
import java.util.Set;

public class Main {
    private static void Task1() {
        LocalTime start = LocalTime.now();
        LocalTime end = start.plusHours(1);
        var timeInterval = new TimeInterval(start, end);
        System.out.println(timeInterval.overlapsWith(timeInterval));
    }

    private static void Task2() {
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();

        LocalDate today = LocalDate.now();

        zoneIds.stream()
                .map(ZoneId::of)
                .forEach(zone -> {
                    int offset = today.atStartOfDay(zone).getOffset().getTotalSeconds() / 3600;
                    System.out.println("Strefa czasowa: " + zone + ", Przesunięcie: " + offset + " godzin");
                });
    }

    private static void Task3() {
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();

        zoneIds.stream()
                .map(ZoneId::of)
                .filter(zone -> zone.getRules().getOffset(zone.getRules().getTransition(LocalDate.now().atStartOfDay(zone).toLocalDateTime()).getInstant()).getTotalSeconds() % 3600 != 0)
                .forEach(System.out::println);
    }

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