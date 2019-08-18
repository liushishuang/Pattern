package pattern.structuralType.decorator;




//具体的Decorator， 这里就是调味品
public class Chocolate extends Decorator {
	public Chocolate(Drink obj) {
		super(obj);
	}

}
