package behavioralType;

import behavioralType.mediator.ConcrateColleague1;
import behavioralType.mediator.ConcrateColleague2;
import behavioralType.mediator.ConcrateMediator;
import behavioralType.mediator.User;
import org.junit.Test;

/**
 * @Author: Liushishuang
 * @Description:
 * @Date: 9:39 2018-7-25
 * 用一个中介对象来封装一系列的对象交互，中介者使各对象不需要显式地相互引用，从而使其耦合松散，而且可以独立地改变它们之间的交互。
 *
 * => 规定平台统计记录每个对象的信息,统一展示.     一个类,所有对象要展示自身消息,统一展示
 *
 * 我们通过聊天室实例来演示中介者模式。实例中，多个用户可以向聊天室发送消息，
 * 聊天室向所有的用户显示消息。我们将创建两个类 ChatRoom 和 User。User 对象使用 ChatRoom 方法来分享他们的消息。
 *
 * 将交互复杂性 => 中介者的复杂性
 */
public class MediatorTest {
    @Test
    public void testMediator() {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");

    }

    @Test
    public void testMediator2() {
        ConcrateMediator mediator = new ConcrateMediator();

        //让两个具体的同事类认识中介者对象
        ConcrateColleague1 colleague1 = new ConcrateColleague1(mediator);
        ConcrateColleague2 colleague2 = new ConcrateColleague2(mediator);
        //中介者对象认识具体的同事类
        mediator.setColleague1(colleague1);
        mediator.setColleague2(colleague2);
        // 具体同事类的发送信息都是通过中介者转发的 (实际调用的是中介者的send方法)
        colleague1.send("吃过饭了吗?");
        colleague2.send("没有呢，你打算请客?");
    }
}
