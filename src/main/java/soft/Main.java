package soft;

import soft.exeptions.NotEnoughArgumentsException;

public class Main {

    public static void main(String[] args) throws NotEnoughArgumentsException {
        Dispatcher dispatcher = new Dispatcher(args);
        dispatcher.dispatch();
    }

}
