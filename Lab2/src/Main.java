public class Main {
    public static void main(String[] args) {
        var first = new Greeter("first", 5);
        var second = new Greeter("second", 5);

        var firstThread = new Thread(first);
        var secondThread = new Thread(second);
        
        firstThread.start();
        secondThread.start();
    }
}