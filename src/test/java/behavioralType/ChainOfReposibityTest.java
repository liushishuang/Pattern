package behavioralType;

import behavioralType.chainOfReposibity.AbstractLogger;
import behavioralType.chainOfReposibity.ConsoleLogger;
import behavioralType.chainOfReposibity.ErrorLogger;
import behavioralType.chainOfReposibity.FileLogger;
import org.junit.Test;

/**
 * 我们创建抽象类 AbstractLogger，带有详细的日志记录级别。然后我们创建三种类型的记录器，
 * 都扩展了 AbstractLogger。每个记录器消息的级别是否属于自己的级别，如果是则相应地打印出来，否则将不打印并把消息传给下一个记录器。
 */
public class ChainOfReposibityTest {
    @Test
    public void testChainOfReposibility() {
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        AbstractLogger loggerChain = errorLogger;

        loggerChain.logMessage(AbstractLogger.INFO,
                "This is an information.");

        loggerChain.logMessage(AbstractLogger.DEBUG,
                "This is an debug level information.");

        loggerChain.logMessage(AbstractLogger.ERROR,
                "This is an error information.");


    }
}
