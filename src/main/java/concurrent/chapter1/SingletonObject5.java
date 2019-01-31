package concurrent.chapter1;

/**
 * @author LiuShishuang
 */
public class SingletonObject5 {

    private static volatile SingletonObject5 instance;

    private SingletonObject5() {

    }

    public static SingletonObject5 getInstance() {

        if (null == instance) {
            synchronized (SingletonObject4.class) {
                if (null == instance) {
                    instance = new SingletonObject5();
                }
            }
        }
        return SingletonObject5.instance;
    }
}
