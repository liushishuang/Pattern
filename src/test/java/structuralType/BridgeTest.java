package structuralType;

import org.junit.Test;
import structuralType.bridge.Square;
import structuralType.bridge.White;
import structuralType.bridge.Circle;

/**
 * @Author: Liushishuang
 * @Description:
 * @Date: 16:44 2018-7-24
 * 实体类的功能独立于接口实现类。这两种类型的类可被结构化改变而互不影响。  继承会造成类爆炸问题，扩展起来不灵活。
 * 将颜色接口传入,实际调用的是颜色的方法 draw->paint
 *
 * 我们有一个作为桥接实现的 DrawAPI 接口和实现了 DrawAPI 接口的实体类 RedCircle、GreenCircle。Shape
 * 是一个抽象类，将使用 DrawAPI 的对象。BridgePatternDemo，我们的演示类使用 Shape 类来画出不同颜色的圆。
 */
public class BridgeTest {
    @Test
    public void bridgeTest() {
        White white = new White();
        Square square = new Square(white);
        square.draw();

        Circle circle = new Circle(white);
        circle.draw();


    }
}
