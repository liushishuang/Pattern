package pattern.structuralType.facade.facadeShape;

/**
 * @Author: Liushishuang
 * @Description:
 * @Date: 19:17 2018-7-24
 */
public class ShapeMaker {
    private Shape circle;
    private Shape square;

    public ShapeMaker() {
        this.circle = new Circle();
        this.square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }

    public void drawSquare(){
        square.draw();
    }

}
