package pattern.structuralType.decorator.decoratorShape;

/**
 * @Author: Liushishuang
 * @Description:
 * @Date: 18:36 2018-7-24
 */
public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        super.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Red");
    }
}
