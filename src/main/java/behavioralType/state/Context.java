package behavioralType.state;

/**
 * @Author: Liushishuang
 * @Description:
 * @Date: 15:05 2018-7-25
 */
public class Context {
    private State state;

    public Context(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
}
