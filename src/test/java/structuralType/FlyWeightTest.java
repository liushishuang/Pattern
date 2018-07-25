package structuralType;

import org.junit.Test;
import structuralType.flyWight.Circle;
import structuralType.flyWight.ShapeFactory;

/**
 * @Author: Liushishuang
 * @Description:
 * @Date: 19:20 2018-7-24
 * 1.Shape接口和draw方法,实现类为Circle
 * 2. 定义ShapeFactory,维护了一个HashMap,依赖的String为内蕴
 */
public class FlyWeightTest {
    private static final String colors[] =
            { "Red", "Green", "Blue", "White", "Black" };
    private static String getRandomColor() {
        return colors[(int)(Math.random()*colors.length)];
    }
    private static int getRandomX() {
        return (int)(Math.random()*100 );
    }
    private static int getRandomY() {
        return (int)(Math.random()*100);
    }


    @Test
    public void testFlyWight() {
        for(int i=0; i < 20; ++i) {
            Circle circle =
                    (Circle)ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }

    }
}
