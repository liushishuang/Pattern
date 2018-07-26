package behavioralType.command;
//关联接收者
public abstract class Command {
	protected Receiver mReceiver;

	public Command(Receiver receiver) {
		mReceiver = receiver;
	}
	
	public abstract void execute();
}
