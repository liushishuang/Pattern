package pattern.structuralType;

import org.junit.Test;
import pattern.structuralType.facade.ShapeMaker;

/**
 * @Author: Liushishuang
 * @Description:
 * @Date: 19:14 2018-7-24
 * 定义的类 关联所有需要的类,以及方法
 */
public class FacadeTest {
    @Test
    public void testFacade() {
        ShapeMaker sm = new ShapeMaker();
        sm.drawCircle();
        sm.drawSquare();

    }
}
