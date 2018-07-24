package builder;

/**
 * @Author: Liushishuang
 * @Description:
 * @Date: 14:34 2018-7-24
 */
public class Pepsi extends ColdDrink {
    @Override
    public float price() {
        return 35.0f;
    }

    public String name() {
        return "Pepsi";
    }
}
