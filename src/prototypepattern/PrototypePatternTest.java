package prototypepattern;

public class PrototypePatternTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcretePrototype prototype = new ConcretePrototype("prototype");
		System.out.println("prototypeList: "+prototype.getList());
		
		ConcretePrototype copyOfPrototype = prototype.clone();//��ԭ������и���
		copyOfPrototype.setName("copy");
		System.out.println("copyOfPrototype: "+copyOfPrototype.getList());
		
		System.out.println("prototypeList: "+prototype.getList());
		//ǳ���������������Ը�������޸Ļ��ԭ������Ӱ�죩
		//prototypeList: [prototype]
		//copyOfPrototype: [prototype, copy]
		//prototypeList: [prototype, copy]
		//��������������Ը�������޸Ļ��ԭ���಻����Ӱ�죩
		//prototypeList: [prototype]
		//copyOfPrototype: [prototype, copy]
		//prototypeList: [prototype]
	}

}
