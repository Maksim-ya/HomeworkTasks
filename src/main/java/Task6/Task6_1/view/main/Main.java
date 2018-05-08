package Task6.Task6_1.view.main;


import Task6.Task6_1.controller.methodsWithModel.MethodsWithBase;
import Task6.Task6_1.controller.results.Result;
import org.apache.log4j.*;

import java.io.IOException;

public class Main {
    static Logger logger = Logger.getLogger(MethodsWithBase.class);


    public static void main(String[] args) {

        try {
            logger.addAppender(new ConsoleAppender(new SimpleLayout()));

            FileAppender appender = new FileAppender(new SimpleLayout(), "D:\\log.txt");
            logger.addAppender(appender);

            logger.setLevel(Level.DEBUG);
            Result.getResult();
        }
        catch (IllegalArgumentException e) {
            logger.error("This is IllegalArgumentException", e);
        } catch (IOException e) {
            logger.error("This is error i/o", e);
        }
    }
}