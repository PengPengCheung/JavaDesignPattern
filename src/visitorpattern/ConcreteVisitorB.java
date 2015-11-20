package visitorpattern;

public class ConcreteVisitorB extends Visitor {

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
