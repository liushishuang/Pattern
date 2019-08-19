package pattern.behavioralType.responsibilitychain.chainOfReposibity;

/**
 * @Author: LiuShishuang
 * @Description:TODO
 * @Date: 23:36 2019/8/19
 */
public class Client {
    public static void main(String[] args) {
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


        //测试2
        Handler h1 = new ConcrateHandler1();
        Handler h2 = new ConcrateHandler1();
        Handler h3 = new ConcrateHandler1();

        h1.setSuccessor(h2);
        h2.setSuccessor(h3);

        int[] requests = {2, 5, 14, 22, 18, 3, 27, 20};

        for (int request: requests) {
            h1.handleRequest(request);
        }
    }
}
