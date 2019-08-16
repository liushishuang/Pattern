package pattern.structuralType.bridge;

/**
 * @Author: Liushishuang
 * @Description:
 * @Date: 16:57 2018-7-24
 * 黑色的三角形  调用的应该是color的bepaint方法=> color和draw放在抽象类里面
 */
public abstract class Shape {
    Color color;

    public Shape(Color color) {
        this.color = color;
    }
    public abstract void draw();
}
