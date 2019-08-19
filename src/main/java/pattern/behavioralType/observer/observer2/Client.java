package pattern.behavioralType.observer.observer2;

/**
 * @Author: LiuShishuang
 * @Description:TODO
 * @Date: 21:19 2019/8/18
 */
public class Client {
    public static void main(String[] args) {
        Subject sub = new ConcreteSubject();
        sub.addObserver(new ConcreteObserver1());
        sub.addObserver(new ConcreteObserver2());
        sub.doSomething();
    }
}
