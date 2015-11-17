package chain_of_responsibility_pattern;

//�������handler���ڵ���������ͳһ����Handler��ʹ������ͬ�Ľӿ�
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
