package pattern.behavioralType;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * @Author: Liushishuang
 * @Description:
 * @Date: 16:04 2018-7-24
 * 父类与子类: 策略模式  模板方法模式
 *
 * 类与类之间(非继承): 观察者模式  迭代器模式  责任链模式  命令模式
 *
 * 类的状态:  备忘录模式  状态模式
 *
 * 通过中间类  访问者模式  中介者模式  解释器模式
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        ChainOfReposibityTest.class,
        CommandTest.class,
        InterpreterTest.class,
        IteratorTest.class,
        MediatorTest.class,
        MementoTest.class,
        ObserverTest.class,
        StateTest.class,
        StrategyTest.class,
        TemplateTest.class,
        VisitorTest.class
})
public class AllTest {
}
