package pattern.structuralType;

import org.junit.Test;
import pattern.structuralType.bridge.Square;
import pattern.structuralType.bridge.White;
import pattern.structuralType.bridge.Circle;

/**
 * @Author: Liushishuang
 * @Description:
 * @Date: 16:44 2018-7-24
 *
 * 类与类的关系平等,数量大  白色的三角形
 * 实体类的功能独立于接口实现类。这两种类型的类可被结构化改变而互不影响。  继承会造成类爆炸问题，扩展起来不灵活。
 * 将颜色接口传入,实际调用的是颜色的方法 draw->paint
 *
 * 1. 画  某种颜色的  东西  , 方法为paint,     依赖了String shape
 * 2. 定义Black和White实现类
 * 3. 定义Shape接口,     关联了Color接口,自己的抽象方法draw
 * 4. 定义Circle和Square实现类,    其实调用的是Color的paint方法,传入了具体的形状
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
