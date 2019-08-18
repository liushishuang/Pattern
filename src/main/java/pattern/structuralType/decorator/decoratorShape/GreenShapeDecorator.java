package pattern.structuralType.decorator.decoratorShape;

/**
 * @Author: Liushishuang
 * @Description:
 * @Date: 18:36 2018-7-24
 */
public class GreenShapeDecorator extends ShapeDecorator {
    public GreenShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        super.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Green");
    }
}
