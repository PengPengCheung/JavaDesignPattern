package statepattern;

public class StatePatternTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Context context = new Context();
		context.setState(new ConcreteStateA());//…Ë÷√≥ı º◊¥Ã¨
		context.Request();
		context.Request();
		context.Request();
	}

}
