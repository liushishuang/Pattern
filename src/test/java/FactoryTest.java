import Factory.Shape;
import Factory.ShapeFactory;

/**
 * @Author: Liushishuang
 * @Description:
 * @Date: 10:10 2018-7-24
 * 工厂方法设计模式
 */
public class FactoryTest {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        //直接根据名称获取对象, 并调用对象通用方法
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();
    }
}
