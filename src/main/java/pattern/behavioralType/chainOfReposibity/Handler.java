package pattern.behavioralType.chainOfReposibity;

public abstract class Handler {
	protected Handler mSuccessor;
	
	public void setSuccessor(Handler successor) {
		mSuccessor = successor;
	}
	
	public abstract void handleRequest(int request);
}
