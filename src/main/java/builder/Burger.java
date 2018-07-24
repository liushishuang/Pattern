package builder;

/**
 * @Author: Liushishuang
 * @Description:
 * @Date: 14:20 2018-7-24
 * 抽象类实现接口后,方法可以不实现,但是后续的的实现类必须实现接口中未实现方法
 */
public abstract class Burger implements Item {


    public Packing packing() {
        return new Bottle();
    }

    public abstract float price();


}
