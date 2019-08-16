package pattern.creationType.factory.simplefactory.pizzastore.order;

//相当于一个客户端，发出订购
public class PizzaStoreClient {

	public static void main(String[] args) {
		//传统方式
		new OrderPizza();
		
		//使用简单工厂模式
//		new OrderPizza1(new SimpleFactory());
//		new OrderPizza2();
	}

}
