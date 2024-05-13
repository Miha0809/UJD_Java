import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Main {
    private static void Task1() {
        // TODO: ліміт, фільтер, sout
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
        Task2();
    }
}