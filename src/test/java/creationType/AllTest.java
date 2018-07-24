package creationType;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * @Author: Liushishuang
 * @Description:
 * @Date: 16:03 2018-7-24
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        AbstractFactoryTest.class,
        BuilderTest.class,
        FactoryTest.class,
        PrototypeTest.class,
        SingletonTest.class
})
public class AllTest {
}
