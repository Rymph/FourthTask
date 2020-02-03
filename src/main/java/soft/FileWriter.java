package soft;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class FileWriter {

    public void write(File file, String text, String change) throws IOException {
        FileReader reader = new FileReader();
        ArrayList<String> lines = reader.read(file);
        BufferedWriter writer = new BufferedWriter(new java.io.FileWriter(file));
        for (String s : lines) {
            writer.write(s.replaceAll(text, change) + "\n");
            writer.flush();
        }
        writer.close();
    }
}
