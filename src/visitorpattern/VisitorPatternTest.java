package visitorpattern;

public class VisitorPatternTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StructureObject strObj = new StructureObject();
		strObj.attach(new ConcreteElementA());
		strObj.attach(new ConcreteElementB());
		
		Visitor visitorA = new ConcreteVisitorA();
		Visitor visitorB = new ConcreteVisitorB();
		
		strObj.accept(visitorA);
		strObj.accept(visitorB);
		
		
	}

}
