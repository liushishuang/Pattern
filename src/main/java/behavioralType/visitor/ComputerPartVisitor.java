package behavioralType.visitor;


/**
 * @Author: Liushishuang
 * @Description:
 * @Date: 15:31 2018-7-25
 */
public interface ComputerPartVisitor {
    public void visit(Computer  computer);
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
}
