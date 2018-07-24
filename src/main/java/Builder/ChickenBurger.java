package builder;

/**
 * @Author: Liushishuang
 * @Description:
 * @Date: 14:33 2018-7-24
 */
public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 50.5f;
    }

    public String name() {
        return "Chicken Burger";
    }
}
