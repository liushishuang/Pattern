package behavioralType;

import behavioralType.command.*;
import org.junit.Test;

/**
 * @Author: Liushishuang
 * @Description:
 * @Date: 9:06 2018-7-25
 * 在软件系统中，行为请求者与行为实现者通常是一种紧耦合的关系，但某些场合，比如需要对行为进行记录、撤销或重做、
 * 事务等处理时，这种无法抵御变化的紧耦合的设计就不太合适。
 *
 * => 记录对于对象的一系列操作命令
 *
 *需求: 对股票进行买卖交易,并记录买卖的一系列命令???  一个类,记录很多对象操作
 * 1. 股票类,具有名称/数量 属性, 买卖方法
 * 2. Order接口,定义execute方法
 * 3. BuyStock/SellStock类,  关联Stock对象,实现Order接口...因为Broker需要记录Order集合,
 *    并且是对象的操作集合,所以注入的是具体的对象,调用对象的方法
 * 4. Broker类, 定义集合,记录Order, 添加和展示方法
 */
public class CommandTest {
    @Test
    public void testCommand() {
        //定义不同的对象一系列买卖方法
        Stock maotai = new Stock("茅台",1);
        BuyStock buyStockOrder = new BuyStock(maotai);

        Stock samsung = new Stock("三星", 2);
        SellStock sellStockOrder = new SellStock(samsung);

        Stock tencent = new Stock("腾讯",1);
        BuyStock buyStockOrder2 = new BuyStock(tencent);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);
        broker.takeOrder(buyStockOrder2);

        broker.placeOrders();

    }

    @Test
    public void testCommand2() {
        Receiver reciver = new Receiver();
        Command command = new ConcrateCommand(reciver);
        Invoker invoker = new Invoker();

        invoker.setCommand(command);
        invoker.excuteCommand();
    }
}
