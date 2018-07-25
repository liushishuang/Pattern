package behavioralType.state;

/**
 * @Author: Liushishuang
 * @Description:
 * @Date: 15:05 2018-7-25
 */
public class StartState implements State {

    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    @Override
    public String toString(){
        return "Start State";
    }
}