package pattern.creationType.factory.absfactory.pizzastore.order;

import java.util.Calendar;

public class PizzaStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new OrderPizza1(new BJFactory());
		new OrderPizza(new LDFactory());

		Calendar.getInstance();
	}

}
