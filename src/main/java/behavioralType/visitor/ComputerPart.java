package behavioralType.visitor;

/**
 * @Author: Liushishuang
 * @Description:
 * @Date: 15:29 2018-7-25
 * 这里定义的是不变的存在,定义一个Accept的操作,以访问者为参数
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
