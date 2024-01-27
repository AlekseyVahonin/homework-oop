package homework07.model;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class FileLogger {
    private static final Logger logger = Logger.getLogger(FileLogger.class.getName());

    static {
        try {
            FileHandler fileHandler = new FileHandler("src/homework07/calculator_log.txt", true);
            fileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(fileHandler);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void log(Level level, String message) {
        logger.log(level, message);
    }
}
