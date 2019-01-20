package behavioralType.observer;

/**
 * @Author: Liushishuang
 * @Description:
 * @Date: 14:50 2018-7-25
 */
public interface Observer {

    //抽象类使用
  /*  protected Subject subject;

    public Observer(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }*/
    public void update();
}
