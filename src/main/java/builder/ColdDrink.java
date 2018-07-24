package Builder;

/**
 * @Author: Liushishuang
 * @Description:
 * @Date: 14:20 2018-7-24
 */
public abstract class ColdDrink implements Item {


    public Packing packing() {
        return new Bottle();
    }


    public abstract float price();
}
