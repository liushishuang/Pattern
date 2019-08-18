package concurrent.chapter1;

/**
 * singleton design pattern
 * 单例 + 性能 + 优雅
 * @author LiuShishuang
 */
public class SingletonObject1 {

    /**
     * can't lazy load.
     */
    private static final SingletonObject1 INSTANCE = new SingletonObject1();

    private SingletonObject1() {
        //empty
    }

    public static SingletonObject1 getInstance() {
        return INSTANCE;
    }
}