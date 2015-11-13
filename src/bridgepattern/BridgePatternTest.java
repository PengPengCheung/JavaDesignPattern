package bridgepattern;

/*
 * �����ʵ����ͨ����������ĳ����࣬Ȼ�������/�ۺϵķ�ʽ�ó����������ϣ�����ʵ�ַ��ھ����ʵ������
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
