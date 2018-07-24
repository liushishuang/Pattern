package structuralType;

import org.junit.Test;
import structuralType.decorator.*;

/**
 * @Author: Liushishuang
 * @Description:
 * @Date: 18:29 2018-7-24
 */
public class DecoratorTest {
    @Test
    public void testDecorator() {
        //Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());

       /* Shape redSquare = new RedShapeDecorator(new Square());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nSquare of red border");
        redSquare.draw();*/
        System.out.println("hello");


        GreenShapeDecorator decorator = new GreenShapeDecorator(redCircle);
        decorator.draw();
    }
}
