package behavioralType.command;

/**
 * @Author: Liushishuang
 * @Description:
 * @Date: 9:12 2018-7-25
 * 股票交易,具有买卖方法
 */
public class Stock {
    public Stock(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    private String name ;
    private int quantity ;

    public void buy(){
        System.out.println("Stock [ Name: "+name+
                ",Quantity: " + quantity +" ] bought");
    }
    public void sell(){
        System.out.println("Stock [ Name: "+name+", " +
                "Quantity: " + quantity +" ] sold");
    }
}
