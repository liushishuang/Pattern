package abstractFactory;

/**
 * @Author: Liushishuang
 * @Description:
 * @Date: 10:59 2018-7-24
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape) ;
}
