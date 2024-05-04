import java.util.Random;
import java.util.Scanner;

class RandomSequence implements IntSequence {
    private static Random generator = new Random();

    private int low;
    private int high;

    public RandomSequence(int low, int high) {
        super();
        this.low = low;
        this.high = high;
    }

    public int next() {
        return low + generator.nextInt(high - low + 1);
    }

    public boolean hasNext() {
        return true;
    }
}

public class Main {

    private static Runnable foo(Runnable... runnables) {
        return () -> {
            for (Runnable runnable : runnables) {
                runnable.run();
            }
        };
    }

    private static IntSequence randomInts(int low, int high) {
        var numbers = new RandomSequence(low, high);
        return numbers;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mode = -1;

        while (mode != 0) {
            System.out.println("\tNAVIGATION");
            System.out.println("Task 1 - enter 1");
            System.out.println("Task 2 - enter 2");
            System.out.println("Task 3 - enter 3");
            System.out.println("Exit - other");
            mode = scanner.nextInt();

            switch (mode) {
                case 1: {
                    Runnable runnable1 = () -> System.out.println("runnable1");
                    Runnable runnable2 = () -> System.out.println("runnable2");
                    Runnable runnable3 = () -> System.out.println("runnable3");
                    Runnable runnable = foo(runnable1, runnable2, runnable3);
                    runnable.run();
                    break;
                }
                case 3: {
                    var numbers = randomInts(5, 10);

                    while (numbers.hasNext()) {
                        System.out.println(numbers.next());
                    }
                }
                default:
                    break;
            }
        }
    }
}