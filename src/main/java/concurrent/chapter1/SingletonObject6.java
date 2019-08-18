package concurrent.chapter1;

/**
 * @author LiuShishuang
 */
public class SingletonObject6 {

    private SingletonObject6() {

    }

    private static class InstanceHolder {
        private final static SingletonObject6 INSTANCE = new SingletonObject6();
    }

    public static SingletonObject6 getInstance() {
        return InstanceHolder.INSTANCE;
    }
}