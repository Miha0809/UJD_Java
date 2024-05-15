import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static void Task1() throws IOException {
        // TODO: ліміт, фільтер, sout
        String text = new String(Files.readAllBytes(Paths.get("alice.txt")), StandardCharsets.UTF_8);
        List<String> wordList = Arrays.asList(text);

        System.out.println(wordList);
    }

    private static void Task2() throws IOException
    {
        String text = new String(Files.readAllBytes(
            Paths.get("alice.txt")), StandardCharsets.UTF_8);
        List<String> wordList = Arrays.asList(text.split("\\PL+"));
        
        // for stream
        long startFirstTime = System.currentTimeMillis();
        long first = wordList.stream()
                             .filter(word -> word.length() > 12)
                             .count();
        long endFirstTime = System.currentTimeMillis();

        // for parallelStream
        long startSecondTime = System.currentTimeMillis();
        long second = wordList.parallelStream()
                              .filter(word -> word.length() > 12)
                              .count();
        long endSecondTime = System.currentTimeMillis();

        System.out.println("stream count: " + first);
        System.out.println("parallelStream count: " + second);
    
        System.out.println("stream: " + (endFirstTime - startFirstTime));
        System.out.println("parallelStream: " + (endSecondTime - startSecondTime));
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int task = -1;

        while (task != 0) {
            System.out.println("\n\t\tNAVIGATION");
            System.out.println("Task 1 - enter 1");
            System.out.println("Task 2 - etner 2");
            System.out.println("Task 3 - etner 3");
            System.out.println("Task 4 - etner 4");
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
                default:
                    break;
            }
        }

        Task2();
    }
}