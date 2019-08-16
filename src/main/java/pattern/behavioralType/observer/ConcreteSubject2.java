package pattern.behavioralType.observer;

/**
 * @Author: Liushishuang
 * @Description:
 * @Date: 14:49 2018-7-25
 */
public class ConcreteSubject2 extends Subject {
    @Override
    public void doSomething(){
        System.out.println("被观察者事件反生2");
        this.notifyObserver();
    }
}
