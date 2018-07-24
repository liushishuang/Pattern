package structuralType;

import org.junit.Test;
import structuralType.facade.ShapeMaker;

/**
 * @Author: Liushishuang
 * @Description:
 * @Date: 19:14 2018-7-24
 */
public class FacadeTest {
    @Test
    public void testFacade() {
        ShapeMaker sm = new ShapeMaker();
        sm.drawCircle();
        sm.drawSquare();

    }
}
