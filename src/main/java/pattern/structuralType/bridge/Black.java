package pattern.structuralType.bridge;

/**
 * @Author: Liushishuang
 * @Description:
 * @Date: 16:56 2018-7-24
 */
public class Black implements Color {
    public void paint(String shape) {
        System.out.println("黑色的"+shape);
    }
}
