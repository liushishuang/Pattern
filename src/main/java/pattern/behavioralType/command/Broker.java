package pattern.behavioralType.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Liushishuang
 * @Description:
 * @Date: 9:14 2018-7-25
 */
public class Broker {
    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
