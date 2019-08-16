package pattern.behavioralType;

import pattern.behavioralType.template.Football;
import pattern.behavioralType.template.Game;
import org.junit.Test;

/**
 * @Author: Liushishuang
 * @Description:
 * @Date: 15:18 2018-7-25
 * ：一个抽象类中，有一个主方法，再定义1...n个方法，可以是抽象的，也可以是实际的方法，定义一个类，继承该抽象类，重写抽象方法，通过调用抽象类，实现对子类的调用
 */
public class TemplateTest {
    @Test
    public void testTemplate() {
        Game game = new Football();
        game.play();
    }
}
