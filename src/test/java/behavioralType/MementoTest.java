package behavioralType;

import behavioralType.memento.CareTaker;
import behavioralType.memento.Originator;
import org.junit.Test;

/**
 * @Author: Liushishuang
 * @Description:
 * @Date: 14:28 2018-7-25
 * 通过一个备忘录类专门存储对象状态。一个类来恢复状态
 */
public class MementoTest {
    @Test
    public void testMemento() {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        originator.setState("State #1");
        originator.setState("State #2");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #3");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #4");

        System.out.println("Current State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("First saved State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second saved State: " + originator.getState());

    }
}
