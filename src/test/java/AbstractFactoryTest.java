import AbstractFactory.FactoryProducer;
import AbstractFactory.AbstractFactory;
import AbstractFactory.Shape;
/**
 * @Author: Liushishuang
 * @Description:
 * @Date: 10:10 2018-7-24
 * 工厂方法设计模式
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        //获取形状工厂FactoryProducer
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        //获取形状为 Circle 的对象
        Shape shape1 = shapeFactory.getShape("CIRCLE");

        //调用 Circle 的 draw 方法
        shape1.draw();
    }
}
