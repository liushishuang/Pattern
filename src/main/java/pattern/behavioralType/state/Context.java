package pattern.behavioralType.state;

/**
 * @Author: Liushishuang
 * @Description:
 * @Date: 15:05 2018-7-25
 * 维护了状态实例,为当前状态
 */
public class Context {
    private State state;

    public Context(State state) {
        this.state = state;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }

    //当前状态下做事
    public void request() {
        state.doAction(this);
    }
}
