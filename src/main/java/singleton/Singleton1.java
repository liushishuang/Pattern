package singleton;

/**
 * @Author: Liushishuang
 * @Description:
 * @Date: 11:29 2018-7-24
 * 饿汉式
 * 线程不安全
 * 容易产生垃圾对象
 */
public class Singleton1 {
    private static Singleton1 singleton = new Singleton1();
    private Singleton1(){}
    public static Singleton1 getInstance(){
        return singleton;
    }
}
