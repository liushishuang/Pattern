package structuralType;

import org.junit.Test;
import structuralType.decorator.*;

/**
 * @Author: Liushishuang
 * @Description:
 * @Date: 18:29 2018-7-24
 * 1. Shape类以及draw方法, 实现Shape的Circle类和Square类
 * 2. 装饰的抽象类 实现Shape接口 + 注入Shape接口,抽象方法来实现接口的方法(为了多了装饰)
 * 3. 具体的装饰类 继承了装饰抽象类  重写draw方法中,可以调用自定义的方法
 */
public class DecoratorTest {
    @Test
    public void testDecorator() {
        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redSquare = new RedShapeDecorator(new Square());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nSquare of red border");
        redSquare.draw();
        System.out.println("hello");


        GreenShapeDecorator decorator = new GreenShapeDecorator(redCircle);
        decorator.draw();
    }
}
