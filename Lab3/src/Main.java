import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mode = -1;

        while (mode != 0)
        {
            System.out.println("NAVIGATION");
            System.out.println("Enter 1 - task1");
            System.out.println("Enter 2 - task2");
            System.out.println("Enter 2 - task2");
            mode = scanner.nextInt();

            switch (mode)
            {
                case 1: {
                    var readDirectories = new ReadDirectories();
                    readDirectories.Read("ajp-2024-w03");
                    break;
                }
                case 2: {
                    var readFiles = new ReadFiles();
                    readFiles.Read("ajp-2024-w03");
                    break;
                }
            }
        }
    }
}