package behavioralType;

import behavioralType.visitor.Computer;
import behavioralType.visitor.ComputerPart;
import behavioralType.visitor.ComputerPartDisplayVisitor;
import org.junit.Test;

/**
 * @Author: Liushishuang
 * @Description:
 * @Date: 15:22 2018-7-25
 */
public class VisitorTest {
    @Test
    public void testVisitor() {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
