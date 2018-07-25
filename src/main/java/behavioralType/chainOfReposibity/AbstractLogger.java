package behavioralType.chainOfReposibity;

/**
 * @Author: LiuShishuang
 * @Description:
 * @Date: 0:10 2018/7/25
 */
public abstract class AbstractLogger {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    // 共1,2,3 级别,级别越大越严重...当严重的时候,记录小于它的所有日志,调用链的顺序为3,2,1
    protected int level;

    //责任链中下一个元素
    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger){
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message) {
        if (this.level <= level) {
            write(message);
        }
        if (nextLogger != null) {
            nextLogger.logMessage(level,message);
        }
    }

     protected abstract void write(String message);

}
