package pattern.behavioralType.mediator;

/**
 * 使用中介者的抽象抽象同事类
 * 关联了中介者
 */
public class Colleague {
	protected Mediator mMediator;

	public Colleague(Mediator mediator) {
		mMediator = mediator;
	}
	
}
