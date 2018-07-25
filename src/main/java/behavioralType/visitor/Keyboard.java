package behavioralType.visitor;

/**
 * @Author: Liushishuang
 * @Description:
 * @Date: 15:33 2018-7-25
 */
public class Keyboard  implements ComputerPart {


    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
