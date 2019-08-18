package pattern.creationType.factory.simplefactory.pizzastore.order;



import pattern.creationType.factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza1 {


	//2. �򵥹���ģʽ
	//����һ���򵥹�������,��ʼ����ʱ��
	SimpleFactory simpleFactory;
	Pizza pizza = null;
	
	//������
	public OrderPizza1(SimpleFactory simpleFactory) {
		setFactory(simpleFactory);
	}
	
	public void setFactory(SimpleFactory simpleFactory) {
		String orderType = ""; //�û������
		
		this.simpleFactory = simpleFactory; //���ü򵥹�������
		
		do {
			orderType = getType(); 
			pizza = this.simpleFactory.createPizza(orderType);
//			 pizza = SimpleFactory.createPizza2(orderType);
			//���pizza
			if(this.pizza != null) { //�����ɹ�
				this.pizza.prepare();
				this.pizza.bake();
				this.pizza.cut();
				this.pizza.box();
			} else {
				System.out.println(" ��������ʧ�� ");
				break;
			}
		}while(true);
	}


	// дһ�����������Ի�ȡ�ͻ�ϣ����������������
	private String getType() {
		try {
			BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("input pizza ����:");
			String str = strin.readLine();
			return str;
		} catch (IOException e) {
			e.printStackTrace();
			return "";
		}
	}

}
