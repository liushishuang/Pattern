package builder;

/**
 * @Author: Liushishuang
 * @Description:
 * @Date: 14:23 2018-7-24
 */
public class VegBurger extends Burger {
    @Override
    public float price() {
        return 25.0f;
    }

    public String name() {
        return "Veg Burger";
    }
}
