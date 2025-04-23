package utils;

import java.io.File;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Class Name: LoggerHandler
 * Author Name: Sharmila Abdul
 * Description: Handles logging operations using Log4j2, ensuring logs directory exists.
 */
public class LoggerHandler {

    private static final Logger log = LogManager.getLogger(LoggerHandler.class);

    /*
     * Constructor Name: LoggerHandler
     * Author Name: Sharmila Abdul
     * Description: Initializes the LoggerHandler and ensures the "logs" directory exists.
     */
    public LoggerHandler() {
        File logsDir = new File("logs");
        if (!logsDir.exists()) {
            logsDir.mkdirs();
        }
    }

    /*
     * Method Name: logTrace
     * Author Name: Sharmila Abdul
     * Description: Logs a trace level message.
     * Return type: void
     * Param List: String msg - The message to log.
     */
    public void logTrace(String msg) {
        log.trace(msg);
    }

    /*
     * Method Name: logDebug
     * Author Name: Sharmila Abdul
     * Description: Logs a debug level message.
     * Return type: void
     * Param List: String msg - The message to log.
     */
    public void logDebug(String msg) {
        log.debug(msg);
    }

    /*
     * Method Name: logInfo
     * Author Name: Sharmila Abdul
     * Description: Logs an info level message.
     * Return type: void
     * Param List: String msg - The message to log.
     */
    public void logInfo(String msg) {
        log.info(msg);
    }

    /*
     * Method Name: logWarn
     * Author Name: Sharmila Abdul
     * Description: Logs a warn level message.
     * Return type: void
     * Param List: String msg - The message to log.
     */
    public void logWarn(String msg) {
        log.warn(msg);
    }

    /*
     * Method Name: logError
     * Author Name: Sharmila Abdul
     * Description: Logs an error level message.
     * Return type: void
     * Param List: String msg - The message to log.
     */
    public void logError(String msg) {
        log.error(msg);
    }

    /*
     * Method Name: logFatal
     * Author Name: Sharmila Abdul
     * Description: Logs a fatal level message.
     * Return type: void
     * Param List: String msg - The message to log.
     */
    public void logFatal(String msg) {
        log.fatal(msg);
    }
}
