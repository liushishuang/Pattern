package behavioralType;

import behavioralType.chainOfReposibity.AbstractLogger;
import behavioralType.chainOfReposibity.ConsoleLogger;
import behavioralType.chainOfReposibity.ErrorLogger;
import behavioralType.chainOfReposibity.FileLogger;
import org.junit.Test;

/**
 * => 多个对象处理同一个事件, 并且具有明显的等级关系
 *
 * 有多个对象，每个对象持有对下一个对象的引用，这样就会形成一条链，请求在这条链上传递，直到某一对象决定处理该请求。
 * 但是发出者并不清楚到底最终那个对象会处理该请求，所以，责任链模式可以实现，在隐瞒客户端的情况下，对系统进行动态的调整
 *
 * 我们创建抽象类 AbstractLogger，带有详细的日志记录级别1,2,3。数量越大越严重,并且调用链的顺序为 3->2->1  并且关联了其它调用链对象
 * 定义了抽象write方法 +logMessage(level,message)方法 如果this.level < level 打印  否则递归调用
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
