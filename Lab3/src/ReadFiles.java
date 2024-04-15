import java.io.File;

public class ReadFiles implements IRead {
    @Override
    public void Read(String path) {
        File file = new File(path);

        if (!file.exists() || !file.isDirectory()) {
            return;
        }

        for (File f : file.listFiles()) {
            if (f.isFile()) {
                System.out.println(f.getPath());
                Read(f.getPath());
            }
        }
    }
}
