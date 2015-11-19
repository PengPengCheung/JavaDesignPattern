package templatemethodpattern;

public class TemplateMethodPatternTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractClass abstractClass;
		
		abstractClass = new ConcreteClassA();
		abstractClass.TemplateMethod();
		
		abstractClass = new ConcreteClassB();
		abstractClass.TemplateMethod();
	}
}
