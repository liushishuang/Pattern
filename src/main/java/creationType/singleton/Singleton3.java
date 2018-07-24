package creationType.singleton;

/**
 * @Author: Liushishuang
 * @Description:
 * @Date: 11:31 2018-7-24
 * 懒汉式,效率慢
 */
public class Singleton3 {
    private static Singleton3 singleton3;
    private Singleton3(){}

    public static synchronized Singleton3 getInstance(){
        if (singleton3 == null) {
            singleton3 = new Singleton3();
        }
        return singleton3;
    }

}
