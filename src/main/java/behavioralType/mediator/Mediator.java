package behavioralType.mediator;

/**
 * 抽象的中介者
 */
public abstract class Mediator {
	public abstract void send(String message, Colleague colleague);
}
