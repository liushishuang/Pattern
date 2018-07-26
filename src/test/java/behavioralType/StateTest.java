package behavioralType;

import behavioralType.state.Context;
import behavioralType.state.StartState;
import behavioralType.state.State;
import behavioralType.state.StopState;
import org.junit.Test;

/**
 * @Author: Liushishuang
 * @Description:
 * @Date: 14:58 2018-7-25
 * 通常命令模式的接口中只有一个方法。而状态模式的接口中有一个或者多个方法。而且，状态模式的实现类的方法，一般返回值，或者是改变实例变量的值。
 * 也就是说，状态模式一般和对象的状态有关。实现类的方法有不同的功能，覆盖接口中的方法。状态模式和命令模式一样，也可以用于消除 if...else 等条件选择语句。
 * <p>
 * 当一个对象的行为取决于它的状态, 并且它必须在运行时刻根据状态来改变行为,就可以考虑使用状态模式了
 * 1. Context类, 具有State属性,get/set方法
 * 2. State接口, 具有doAction方法,不同状态下不同行为
 * 3. State的实现类,实现方法 + 设置context状态
 */
public class StateTest {
    @Test
    public void testState() {
        State startState = new StartState();



        Context context = new Context(startState);

       context.request();
       context.request();
       context.request();
       context.request();
       context.request();


    }
}
