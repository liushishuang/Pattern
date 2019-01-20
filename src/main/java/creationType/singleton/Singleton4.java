package creationType.singleton;

/**
 * @Author: Liushishuang
 * @Description:
 * @Date: 11:31 2018-7-24
 * 懒汉式,双重锁,提高效率
 * <p>
 * static防止空指针异常
 * <p>
 * 将同步内容下方到if内部,提高了执行的效率...单层if判断,100个线程,耗费时间为100*(同步判断时间+if判断时间)
 * , 双重if判断可以同时if判断
 * <p>
 * 当instance为null,并且有两个线程调用getInstance()方法时,它们将都通过第一重instance==null
 * 的判断. 然后由于锁机制,这两个线程只能有一个进入,另一个在外面排队等候,必须等到其中的一个出来后,
 * 另一个才能进入. 而此时,如果没有了第二重instance是否为null的判断,则会创建两个实例.
 */
public class Singleton4 {
    // 防止空指针异常
    private static volatile Singleton4 singleton4;

    private Singleton4() {
    }

    // double check
    public static Singleton4 getInstance() {
        if (singleton4 == null) {
            // 可能有两个线程同时进入到这里,只有一个获取到了锁
            synchronized (Singleton4.class) {
                if (singleton4 == null) {
                    singleton4 = new Singleton4();
                }
            }
        }
        return singleton4;
    }

}
