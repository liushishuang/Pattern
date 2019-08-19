package pattern.behavioralType.state.stateForStart;

/**
 * @Author: LiuShishuang
 * @Description:TODO
 * @Date: 23:13 2019/8/19
 */
public class Client {
    public static void main(String[] args) {
        State startState = new StartState();

        Context context = new Context(startState);

        context.request();
        context.request();
        context.request();
        context.request();
        context.request();
    }

}
