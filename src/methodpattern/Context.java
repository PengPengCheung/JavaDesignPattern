package methodpattern;

public class Context {
	
	private Strategy strategy;
	String arg1;//模拟外界传入的参数，可用做算法需要的参数
	
	public Context(Strategy strategy){
		this.strategy = strategy;
	}
	
	public void useAlgorithm(){
		strategy.useAlgorithm(this);
	}
}
