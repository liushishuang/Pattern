package pattern.structuralType.flyWight;

import java.util.HashMap;

/**
 * @Author: Liushishuang
 * @Description:
 * @Date: 19:23 2018-7-24
 */
public class ShapeFactory {
    // 使用final修饰,外部不可更改的
    public static final HashMap<String, Shape> circleMap = new HashMap<String, Shape>();
    public static Shape getCircle(String color){
        Circle circle = (Circle) circleMap.get(color);
        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}
