package pattern.behavioralType.observer;

/**
 * @Author: Liushishuang
 * @Description:
 * @Date: 14:51 2018-7-25
 */
public class ConcreteObserver2 implements Observer {
    public void update() {
        System.out.println("观察者2收到信息，并进行处理。");
    }
}
