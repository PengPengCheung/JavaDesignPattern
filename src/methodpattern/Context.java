package methodpattern;

public class Context {
	
	private Strategy strategy;
	String arg1;//ģ����紫��Ĳ������������㷨��Ҫ�Ĳ���
	
	public Context(Strategy strategy){
		this.strategy = strategy;
	}
	
	public void useAlgorithm(){
		strategy.useAlgorithm(this);
	}
}
