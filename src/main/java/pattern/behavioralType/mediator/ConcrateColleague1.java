package pattern.behavioralType.mediator;

/**
 * 具体的同事类
 * 自定义的send犯法方法中,使用了中介者的send方法
 */
public class ConcrateColleague1 extends Colleague {

	public ConcrateColleague1(Mediator mediator) {
		super(mediator);
	}
	
	public void send(String message) {
		mMediator.send(message, this);
	}
	
	public void notify(String message) {
		System.out.println(String.format("同事1得到信息:%s", message));
	}

}
