package behavioralType.mediator;

/**
 * 多个同事类之间进行交互的具体的中介者类
 */
public class ConcrateMediator extends Mediator {
	private ConcrateColleague1 mConcrateColleague1;
	private ConcrateColleague2 mConcrateColleague2;
	
	@Override
	public void send(String message, Colleague colleague) {
		if (colleague == mConcrateColleague1) {
			mConcrateColleague2.notify(message);
		} else {
			mConcrateColleague1.notify(message);
		}
	}
	
	public void setColleague1(ConcrateColleague1 concrateColleague) {
		mConcrateColleague1 = concrateColleague;
	}
	
	public void setColleague2(ConcrateColleague2 concrateColleague) {
		mConcrateColleague2 = concrateColleague;
	}
}
