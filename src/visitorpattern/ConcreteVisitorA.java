package visitorpattern;

public class ConcreteVisitorA extends Visitor {

	//����ʵ�ֵķ��ʷ���
	@Override
	public void visitConcreteElementA(ConcreteElementA eleA) {
		// TODO Auto-generated method stub
		System.out.println(eleA.getClass()+" is visited by "+ this.getClass());
	}

	@Override
	public void visitConcreteElementB(ConcreteElementB eleB) {
		// TODO Auto-generated method stub
		System.out.println(eleB.getClass()+" is visited by "+ this.getClass());
	}

}
