package pattern.structuralType.decorator.decoratorShape;

/**
 * @Author: LiuShishuang
 * @Description:TODO
 * @Date: 21:57 2019/8/18
 */
public class Client {
    public static void main(String[] args) {
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

        //双重装饰
        GreenShapeDecorator decorator = new GreenShapeDecorator(redCircle);
        decorator.draw();
    }
}
