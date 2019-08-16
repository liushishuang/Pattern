package pattern.structuralType;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * @Author: Liushishuang
 * @Description:
 * @Date: 16:04 2018-7-24
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        AdapterTest.class,
        BridgeTest.class,
        CompositeTest.class,
        DecoratorTest.class,
        FacadeTest.class,
        FlyWeightTest.class,
        ProxyTest.class
})
public class AllTest {
}
