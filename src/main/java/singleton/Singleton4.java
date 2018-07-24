package singleton;

/**
 * @Author: Liushishuang
 * @Description:
 * @Date: 11:31 2018-7-24
 * 懒汉式,双重锁,提高效率
 */
public class Singleton4 {
    private static volatile Singleton4 singleton4;
    private Singleton4(){}

    public static  Singleton4 getInstance(){
        if (singleton4 == null) {
            synchronized (Singleton4.class) {
                if (singleton4 == null) {
                    singleton4 = new Singleton4();
                }
            }
        }
        return singleton4;
    }

}
