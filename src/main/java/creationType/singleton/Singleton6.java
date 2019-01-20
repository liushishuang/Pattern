package creationType.singleton;

/**
 * @Author: Liushishuang
 * @Description:
 * @Date: 14:01 2018-7-24
 * 饿汉式,线程安全,自由化序列,保证单例(枚举模式为private final)
 */
public class Singleton6 {
    private Singleton6() {

    }

    private enum Singleton {
        INSTANCE;

        private final Singleton6 instance;

        Singleton() {
            instance = new Singleton6();
        }

        public Singleton6 getInstance() {
            return instance;
        }
    }

    public static Singleton6 getInstance() {
        return Singleton.INSTANCE.getInstance();
    }
}
