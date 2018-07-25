package creationType.abstractFactory;

/**
 * @Author: Liushishuang
 * @Description:
 * @Date: 10:59 2018-7-24
 * 添加所有的创建方法
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape) ;
}
