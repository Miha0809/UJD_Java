import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Main {
    private static void Task1() {
        ZoneId franceZone = ZoneId.of("Europe/Paris");
        ZoneId chinaZone = ZoneId.of("Asia/Shanghai");
        ZoneId thailandZone = ZoneId.of("Asia/Bangkok");
        ZonedDateTime franceDateTime = ZonedDateTime.now(franceZone);
        ZonedDateTime chinaDateTime = ZonedDateTime.now(chinaZone);
        ZonedDateTime thailandDateTime = ZonedDateTime.now(thailandZone);

        System.out.println("Data i czas we Francji:");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, d MMMM yyyy, HH:mm:ss", Locale.FRANCE);
        String formattedDateTime = franceDateTime.format(formatter);
        System.out.println(formattedDateTime);

        System.out.println("\nData i czas w Chinach:");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("EEEE, d MMMM yyyy, HH:mm:ss", Locale.CHINA);
        String formattedDateTime2 = chinaDateTime.format(formatter2);
        System.out.println(formattedDateTime2);

        System.out.println("\nData i czas w Tajlandii (z cyframi tajskimi):");
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("EEEE, d MMMM yyyy, HH:mm:ss", new Locale("th", "TH"));
        String formattedDateTime3 = thailandDateTime.format(formatter3);
        System.out.println(formattedDateTime3);
    }

    private static void Task2() {
        Locale[] locales = Locale.getAvailableLocales();

        for (Locale locale : locales) {
            try {
                DecimalFormatSymbols symbols = DecimalFormatSymbols.getInstance(locale);
                char zeroDigit = symbols.getZeroDigit();
                if (Character.UnicodeBlock.of(zeroDigit) != Character.UnicodeBlock.BASIC_LATIN) {
                    System.out.println(locale + " uses non-Western digits: " + zeroDigit);
                }
            } catch (Exception e) {
            }
        }
    }

    private static void Task3() {}

    private static void Task4() {}

    private static void Task5() {}

    private static void Task6() {}

    private static void Task7() {}

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
                case 7: {
                    Task7();
                    break;
                }
                default:
                    scanner.close();
                    break;
            }
        }
    }
}