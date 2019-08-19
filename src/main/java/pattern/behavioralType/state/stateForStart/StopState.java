package pattern.behavioralType.state.stateForStart;

/**
 * @Author: Liushishuang
 * @Description:
 * @Date: 15:06 2018-7-25
 */
public class StopState implements State {

    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(new StartState());
    }

    @Override
    public String toString(){
        return "Stop State";
    }
}
