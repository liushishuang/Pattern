package creationType.singleton;

/**
 * @Author: Liushishuang
 * @Description:
 * @Date: 11:31 2018-7-24
 * 登记式/静态内部类
 * 懒加载,线程安全
 */
public class Singleton5 {

    private Singleton5(){}
    private static class SingletonHolder {
        private static final Singleton5 INSTANCE = new Singleton5();
    }
    public static final Singleton5 getInstance(){
        return SingletonHolder.INSTANCE;
    }


}
