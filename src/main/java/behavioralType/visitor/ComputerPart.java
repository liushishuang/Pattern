package behavioralType.visitor;

/**
 * @Author: Liushishuang
 * @Description:
 * @Date: 15:29 2018-7-25
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
