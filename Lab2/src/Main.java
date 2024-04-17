import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int mode = -1;

        while (mode != 0)
        {
            System.out.println("NAVIGATION");
            System.out.println("Enter 1 - task7");
            System.out.println("Enter 2 - task8");
            System.out.println("Enter 3 - task9");
            System.out.println("Enter 4 - task10");
            mode = scanner.nextInt();

            switch (mode) {
                case 3: {
                    var first = new Greeter("first", 5);
                    var second = new Greeter("second", 5);
            
                    var firstThread = new Thread(first);
                    var secondThread = new Thread(second);
                    
                    firstThread.start();
                    secondThread.start();
                    break;
                }
                case 4: {
                    Runnable task1 = () -> System.out.println("Task1");
                    Runnable task2 = () -> System.out.println("Task2");
                    Runnable task3 = () -> System.out.println("Task3");
                    Runnable task4 = () -> System.out.println("Task4");

                    runTogether(task1, task2, task3, task4);
                    runInOrder(task1, task2, task3, task4);
                    break;
                }
                default:
                    break;
            }
        }
    }

    public static void runTogether(Runnable... tasks)
    {
        final int length = tasks.length;
        Thread[] threads = new Thread[length];

        for (int i = 0; i < length; i++)
        {
            threads[i] = new Thread(tasks[i]);
            threads[i].start();
        }

        for (int i = 0; i < length; i++)
        {
            try {
                threads[i].join();
            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void runInOrder(Runnable... tasks)
    {
        for (Runnable run : tasks)
        {
            run.run();
        }
    }
}