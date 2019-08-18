package pattern.structuralType.decorator.decoratorShape;

/**
 * @Author: Liushishuang
 * @Description:
 * @Date: 18:33 2018-7-24
 * 1. 实现相同的接口
 * 2. 传入原对象,调用方法  原方法
 * 3. 抽象装饰类的出现使得  面向接口/抽象类编程...否则这里就是具体的实现类了
 */
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    //这里的方法叫setShape,更加直观
    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    //这里如果不调用的话,没办法进行多次装饰
    public void draw() {
        decoratedShape.draw();

    }
}
