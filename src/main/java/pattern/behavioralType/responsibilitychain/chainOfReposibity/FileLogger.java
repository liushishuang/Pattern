package pattern.behavioralType.responsibilitychain.chainOfReposibity;

/**
 * @Author: LiuShishuang
 * @Description:TODO
 * @Date: 0:16 2018/7/25
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
