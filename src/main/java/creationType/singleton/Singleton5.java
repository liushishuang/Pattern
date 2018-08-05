package creationType.singleton;

/**
 * @Author: Liushishuang
 * @Description:
 * @Date: 11:31 2018-7-24
 * 登记式/静态内部类
 * 懒加载,线程安全
 *
 * 允许重排序,但是不允许非构造线程看到这个重排序
 * java中对于每一个类或接口,都有唯一的初始化锁LC对应
 */
public class Singleton5 {

    private Singleton5(){}
    //静态类自动实现了锁
    private static class SingletonHolder {
        private static final Singleton5 INSTANCE = new Singleton5();
    }
    public static final Singleton5 getInstance(){
        return SingletonHolder.INSTANCE;
    }


}
