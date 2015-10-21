package decoratorpattern;

public class DecoratorPatternTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Component component = new ConcreteComponent();
		Decorator decA = new ConcreteDecoratorA();
		decA.setComponent(component);
		Decorator decB = new ConcreteDecoratorB();
		decB.setComponent(decA);
		
		decB.Operation();
	}

}
