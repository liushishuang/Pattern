package pattern.behavioralType.visitor;

/**
 * @Author: Liushishuang
 * @Description:
 * @Date: 15:37 2018-7-25
 * 具体的"状态"类, 这里只是定义了一个类,其实可以多个
 */
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {


    public void visit(Computer  computer) {
        System.out.println("Displaying Computer.");
    }


    public void visit(Mouse mouse) {
        System.out.println("Displaying Mouse.");
    }


    public void visit(Keyboard keyboard) {
        System.out.println("Displaying Keyboard.");
    }


    public void visit(Monitor monitor) {
        System.out.println("Displaying Monitor.");
    }
}
