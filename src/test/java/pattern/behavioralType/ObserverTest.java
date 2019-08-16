package pattern.behavioralType;

import pattern.behavioralType.observer.ConcreteObserver1;
import pattern.behavioralType.observer.ConcreteObserver2;
import pattern.behavioralType.observer.ConcreteSubject;
import pattern.behavioralType.observer.Subject;
import org.junit.Test;

/**
 * @Author: Liushishuang
 * @Description:
 * @Date: 14:42 2018-7-25
 * 当对象间存在一对多关系时，则使用观察者模式
 * 1. Subject抽象类 定义Observer集合,add/delete方法 + notifyAll方法调用Observer.update + doSomething抽象方法
 * 2. ConcreteSubject实现doSomething,并调用notifyAll
 * 3. Observer定义update方法,多实现类
 */
public class ObserverTest {
    @Test
    public void testObserver() {
        Subject sub = new ConcreteSubject();
        sub.addObserver(new ConcreteObserver1());
        sub.addObserver(new ConcreteObserver2());
        sub.doSomething();
    }
}
