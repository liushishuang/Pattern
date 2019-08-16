package pattern.behavioralType.memento;

/**
 * @Author: Liushishuang
 * @Description:
 * @Date: 14:34 2018-7-25
 * 发起人
 */
public class Originator {
    private String state;

    public void setState(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }

    public Memento saveStateToMemento(){
        return new Memento(state);
    }

    public void getStateFromMemento(Memento Memento){
        state = Memento.getState();
    }
    public void show() {
        System.out.println(String.format("state=%s", state));
    }
}
