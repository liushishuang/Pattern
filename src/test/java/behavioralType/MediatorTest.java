package behavioralType;

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
 * 1. 对象之间的交互,中介者起到中心化的作用,不需要引入所有其它对象,而只是使用了聊天室的方法,并注入自己独特标识 this =>依赖了聊天室和外部Message
 * 2. 聊天室需要记录每个对象的信息,需要记录User
 */
public class MediatorTest {
    @Test
    public void testMediator() {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");

    }
}
