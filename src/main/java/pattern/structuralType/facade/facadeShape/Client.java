package pattern.structuralType.facade.facadeShape;

/**
 * @Author: LiuShishuang
 * @Description:TODO
 * @Date: 21:57 2019/8/18
 */
public class Client {
    public static void main(String[] args) {
        ShapeMaker sm = new ShapeMaker();
        sm.drawCircle();
        sm.drawSquare();
    }
}
