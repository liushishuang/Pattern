package pattern.structuralType.bridge.shapeAndColor;

import pattern.structuralType.bridge.shapeAndColor.Color;

/**
 * @Author: Liushishuang
 * @Description:
 * @Date: 16:56 2018-7-24
 */
public class White implements Color {
    public void paint(String shape) {
        System.out.println("白色的"+shape);
    }
}
