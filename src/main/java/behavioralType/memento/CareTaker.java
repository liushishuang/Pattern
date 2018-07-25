package behavioralType.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Liushishuang
 * @Description:
 * @Date: 14:35 2018-7-25
 */
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}
