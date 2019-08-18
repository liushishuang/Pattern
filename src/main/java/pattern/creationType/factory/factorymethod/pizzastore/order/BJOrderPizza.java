package pattern.creationType.factory.factorymethod.pizzastore.order;


import pattern.creationType.factory.factorymethod.pizzastore.pizza.BJCheesePizza;
import pattern.creationType.factory.factorymethod.pizzastore.pizza.BJPepperPizza;
import pattern.creationType.factory.factorymethod.pizzastore.pizza.Pizza;

/**
 * 工厂方法模式--将创建对象的方法作为抽象类的方法,等待实现类去实现
 *  			 实现类可以依据自己的需求去组合, 而不是在工厂类实现
 */
public class BJOrderPizza extends OrderPizza {

	
	@Override
	Pizza createPizza(String orderType) {
	
		Pizza pizza = null;
		if(orderType.equals("cheese")) {
			pizza = new BJCheesePizza();
		} else if (orderType.equals("pepper")) {
			pizza = new BJPepperPizza();
		}
		// TODO Auto-generated method stub
		return pizza;
	}

}
