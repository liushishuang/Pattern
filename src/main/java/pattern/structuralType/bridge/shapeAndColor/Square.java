package pattern.structuralType.bridge.shapeAndColor;

import pattern.structuralType.bridge.shapeAndColor.Color;
import pattern.structuralType.bridge.shapeAndColor.Shape;

/**
 * @Author: Liushishuang
 * @Description:
 * @Date: 17:08 2018-7-24
 */
public class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        color.paint("方形");
    }
}
