public class Greeter implements Runnable {
    private String target;
    private int n;

    public Greeter(String target, int n)
    {
        this.target = target;
        this.n = n;
    }

    @Override
    public void run() {
        for (int i = 0; i < this.n; i++) {
            System.out.println(this.target);
        }
    }
}
