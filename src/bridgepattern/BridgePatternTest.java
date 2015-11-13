package bridgepattern;

/*
 * 具体的实现类通过抽象出它的抽象类，然后用组合/聚合的方式让抽象类进行耦合，具体实现放在具体的实现类中
 * */
public class BridgePatternTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstraction abs = new ConcreteAbstraction();
		Implementor ImpA = new ConcreteImplementorA();
		Implementor ImpB = new ConcreteImplementorB();
		
		abs.setImplementor(ImpA);
		abs.Operation();
		
		abs.setImplementor(ImpB);
		abs.Operation();
		
	}

}
