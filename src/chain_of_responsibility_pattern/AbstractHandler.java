package chain_of_responsibility_pattern;

//这个抽象handler存在的意义在于统一各个Handler，使其有相同的接口
public abstract class AbstractHandler {
	private AbstractHandler successor;
	
	protected void setSuccessor(AbstractHandler successor){
		this.successor = successor;
	}
	
	protected AbstractHandler getSuccessor(){
		return successor;
	}
	
	public abstract void handleRequest(int request);
}
