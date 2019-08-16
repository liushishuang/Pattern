package pattern.behavioralType.chainOfReposibity;

/**
 * @Author: LiuShishuang
 * @Description:TODO
 * @Date: 0:15 2018/7/25
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
