import singleton.*;

/**
 * @Author: Liushishuang
 * @Description:
 * @Date: 11:30 2018-7-24
 */
public class SingletonTest {
    public static void main(String[] args) {
        Singleton1 singleton1 = Singleton1.getInstance();

        Singleton2 singleton2 = Singleton2.getInstance();

        Singleton3 singleton3 = Singleton3.getInstance();

        Singleton4 singleton4 = Singleton4.getInstance();

        Singleton5 singleton5 = Singleton5.getInstance();

        Singleton6 singleton6 = Singleton6.INSTANCE;
    }
}
