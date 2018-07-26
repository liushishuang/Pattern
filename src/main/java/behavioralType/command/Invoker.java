package behavioralType.command;
//命令的调用者
public class Invoker {
	private Command mCommand;

	public void setCommand(Command command) {
		mCommand = command;
	}

	public void excuteCommand() {
		mCommand.execute();
	}
}
