package pattern.behavioralType;

import pattern.behavioralType.visitor.Computer;
import pattern.behavioralType.visitor.ComputerPart;
import pattern.behavioralType.visitor.ComputerPartDisplayVisitor;
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

    // 人分为男人/女人 状态为成功/失败, 其中人的种类不多变
    @Test
    public void testVisitor2() {

    }
}
