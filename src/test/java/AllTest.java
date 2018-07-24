import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * @Author: Liushishuang
 * @Description:
 * @Date: 16:04 2018-7-24
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        creationType.AllTest.class,
        structuralType.AllTest.class,
        behavioralType.AllTest.class
})
public class AllTest {
}
