package pattern.behavioralType.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Liushishuang
 * @Description:
 * @Date: 14:49 2018-7-25
 */
public abstract class Subject {
    private List<Observer> obs = new ArrayList<Observer>();
 /*   private int state;

    public int getState() {
        return state;
    }
    // 如果使用state + Observer使用抽象类+ doSomething手动 => 调用setState方法,而不是手动doSomething来触发
    public void setState(int state) {
    //如果相等,不发生变化
        if (state == this.state) {
            return;
        }
        this.state = state;
        doSomething();
    }*/

    public void addObserver(Observer obs) {
        this.obs.add(obs);
    }

    public void delObserver(Observer obs) {
        this.obs.remove(obs);
    }

    protected void notifyObserver() {
        for (Observer o : obs) {
            o.update();
        }
    }

    public abstract void doSomething();
//    private void notifyAllObserver() { obs.stream().forEach(Observer::update); }
}
