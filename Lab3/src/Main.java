import java.io.File;

public class Main {
    public static void main(String[] args) {
        Read("../ajp-2024-w03");
    }

    private static void Read(String path)
    {
        File file = new File(path);

        for (File f : file.listFiles())
        {
            if (f.isDirectory())
            {
                System.out.println(f.getPath());
                Read(f.getPath());
            }
        }
    }
}