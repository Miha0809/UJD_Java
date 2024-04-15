import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

public class ReadAll implements IRead {
    @Override
    public void Read(String path) {
        File[] files = new File(path).listFiles();

        if (files == null)
        {
            System.out.println("File not found");
            return;
        }

        Arrays.sort(files, Comparator.comparing(File::getName));

        for (File file : files) {
            System.out.println(file.getName());
        }
    }
}
