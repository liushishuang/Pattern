package behavioralType.observer;

/**
 * @Author: Liushishuang
 * @Description:
 * @Date: 14:51 2018-7-25
 */
public class ConcreteObserver1 implements Observer {

    // 如果Observer为抽象类,可以获取到subject的信息,如state
  /*  public OctalObserver(Subject subject) {
        super(subject);
    }*/
    @Override
    public void update() {
        System.out.println("观察者1收到信息，并进行处理。");
    }
}
