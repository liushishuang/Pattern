package creationType;

import creationType.singleton.*;
import org.junit.Test;


/**
 * @Author: Liushishuang
 * @Description:
 * @Date: 11:30 2018-7-24
 * > 要点
 * 1. 私有的构造方法
 * 2. 指向自己实例的私有静态引用
 * 3. 以自己实例为返回值的静态的公有方法
 */
public class SingletonTest {
    @Test
    public void testSingleton() {
        Singleton1 singleton1 = Singleton1.getInstance();

        Singleton2 singleton2 = Singleton2.getInstance();

        Singleton3 singleton3 = Singleton3.getInstance();

        Singleton4 singleton4 = Singleton4.getInstance();

        Singleton5 singleton5 = Singleton5.getInstance();

        Singleton6 singleton6 = Singleton6.getInstance();

    }

}
