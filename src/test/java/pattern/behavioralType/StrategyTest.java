package pattern.behavioralType;

import pattern.behavioralType.strategy.Context;
import pattern.behavioralType.strategy.OperationAdd;
import pattern.behavioralType.strategy.OperationMultiply;
import pattern.behavioralType.strategy.OperationSubstract;
import org.junit.Test;

/**
 * @Author: Liushishuang
 * @Description:
 * @Date: 15:10 2018-7-25
 * 策略模式定义了一系列算法，并将每个算法封装起来，使他们可以相互替换，且算法的变化不会影响到使用算法的客户。
 * 需要设计一个接口，为一系列实现类提供统一的方法，多个实现类实现该接口，设计一个抽象类（可有可无，属于辅助类）
 *
 * 策略模式的决定权在用户，系统本身提供不同算法的实现,相同的包装,相同的方法(不同的策略)
 */
public class StrategyTest {
    @Test
    public void testStrategy() {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubstract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}
