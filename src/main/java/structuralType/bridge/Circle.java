package structuralType.bridge;

/**
 * @Author: Liushishuang
 * @Description:
 * @Date: 17:06 2018-7-24
 */
public class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        color.Paint("圆形");
    }
}
