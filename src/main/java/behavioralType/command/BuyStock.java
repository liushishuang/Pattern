package behavioralType.command;

/**
 * @Author: Liushishuang
 * @Description:
 * @Date: 9:13 2018-7-25
 * 对于股票的买的操作
 */
public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.buy();
    }
}
