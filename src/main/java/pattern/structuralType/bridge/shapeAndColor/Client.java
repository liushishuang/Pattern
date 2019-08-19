package pattern.structuralType.bridge.shapeAndColor;

/**
 * @Author: LiuShishuang
 * @Description:TODO
 * @Date: 21:56 2019/8/18
 */
public class Client {
    public static void main(String[] args) {
        White white = new White();
        Square square = new Square(white);
        square.draw();

        Circle circle = new Circle(white);
        circle.draw();
    }
}
