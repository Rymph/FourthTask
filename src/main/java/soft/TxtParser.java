package soft;

import java.io.File;
import java.io.IOException;

public class TxtParser {

    public Result parse(File file, String text) throws IOException {
        Result result = new Result();
        FileReader reader = new FileReader();
        for (String s : reader.read(file)) {
            String[] matches = s.split(" ");
            for (int i = 0; i < matches.length; i++) {
                if (matches[i].contains(text)) {
                    result.addMatch(s);
                }
            }
            result.toNextLine();
        }
        return result;
    }
}
