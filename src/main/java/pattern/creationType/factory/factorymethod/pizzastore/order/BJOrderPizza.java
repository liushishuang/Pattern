package pattern.creationType.factory.factorymethod.pizzastore.order;


import pattern.creationType.factory.factorymethod.pizzastore.pizza.BJCheesePizza;
import pattern.creationType.factory.factorymethod.pizzastore.pizza.BJPepperPizza;
import pattern.creationType.factory.factorymethod.pizzastore.pizza.Pizza;

/**
 * ��������ģʽ--����������ķ�����Ϊ������ķ���,�ȴ�ʵ����ȥʵ��
 *  			 ʵ������������Լ�������ȥ���, �������ڹ�����ʵ��
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
