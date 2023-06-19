import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Writer {

    public static void write(String[] strings, String path) {
        File file = new File(path);        
            try {
                FileWriter writer = new FileWriter(strings[0], true);
                for (String str : strings) {
                    writer.write(str + " ");
                }
                writer.write("\n");
                writer.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }     
    }
}
