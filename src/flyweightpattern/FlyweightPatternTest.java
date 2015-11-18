package flyweightpattern;

public class FlyweightPatternTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlyweightFactory factory = new FlyweightFactory();
		
		Flyweight flyweightA = factory.getFlyweight("A");//AΪ���ⲿ���������״̬
		flyweightA.Opertion("flyweightA");//flyweightAΪ����״̬
		
		Flyweight flyweightB = factory.getFlyweight("B");
		flyweightB.Opertion("flyweightB");
		
		Flyweight flyweightC = factory.getFlyweight("A");
		flyweightC.Opertion("flyweightC");
		
		//���flyweightA��flyweightC��ȣ������ǹ���ͬһ������ռ䣬��Ҳ��������Ԫģʽ�еĹ���˼��
		if(flyweightA == flyweightC){
			System.out.println("flyweightA and flyweightC are the same!");
		}
	}

}
