package behavioralType.memento;

/**
 * @Author: Liushishuang
 * @Description:
 * @Date: 14:32 2018-7-25
 */
public class Memento {
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}
