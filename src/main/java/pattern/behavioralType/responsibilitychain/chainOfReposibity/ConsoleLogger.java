package pattern.behavioralType.responsibilitychain.chainOfReposibity;

/**
 * @Author: LiuShishuang
 * @Description:TODO
 * @Date: 0:15 2018/7/25
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
