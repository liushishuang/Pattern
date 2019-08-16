package pattern.behavioralType.command;
//具体命令
public class ConcrateCommand extends Command {

	public ConcrateCommand(Receiver receiver) {
		super(receiver);
	}

	@Override
	public void execute() {
		mReceiver.action();
	}

}
