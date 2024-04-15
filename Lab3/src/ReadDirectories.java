import java.io.File;

public class ReadDirectories implements IRead {
    @Override
    public void Read(String path) {
        File file = new File(path);

        if (!file.exists() || !file.isDirectory()) {
            System.out.println("Error: The directory does not exist or is not a directory.");
            return;
        }

        for (File f : file.listFiles()) {
            if (f.isDirectory()) {
                System.out.println(f.getPath());
                Read(f.getPath());
            }
        }
    }
}
