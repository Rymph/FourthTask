package soft;

import soft.exeptions.NotEnoughArgumentsException;

import java.io.File;
import java.io.IOException;

public class Dispatcher {

    private File file;
    private String text;
    private TxtParser parser = new TxtParser();
    private byte regymn;
    private String forChange;

    public Dispatcher(String[] args) throws NotEnoughArgumentsException {
        if (args.length < 2 || args.length > 4) {
            throw new NotEnoughArgumentsException("Not enough arguments");
        } else if (args.length == 2) {
            regymn = 1;
            file = new File(args[0].trim());
            text = args[1];
        } else if (args.length == 3) {
            regymn = 2;
            file = new File(args[0].trim());
            text = args[1];
            forChange = args[2];
        }
    }

    public void dispatch() {
        if (regymn == 1) {
            try {
                Result result = parser.parse(file, text);
                System.out.println(result.toString());
            } catch (IOException e) {
                System.out.println("Something go wrong");
            }
        } else if (regymn == 2) {
            try {
                FileWriter writer = new FileWriter();
                writer.write(file, text, forChange);
            } catch (IOException e) {
                System.err.println("Something go wrong");
            }
        }
    }
}
