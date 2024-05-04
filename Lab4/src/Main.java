import java.util.Random;

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

    public static IntSequence randomInts(int low, int high) {
        var numbers = new RandomSequence(low, high);
        return numbers;
    }

    public static void main(String[] args) {
        var numbers = randomInts(5, 10);

        while (numbers.hasNext()) {
            System.out.println(numbers.next());
        }
    }
}