package behavioralType.command;

/**
 * @Author: Liushishuang
 * @Description:
 * @Date: 9:14 2018-7-25
 */
public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.sell();
    }
}
