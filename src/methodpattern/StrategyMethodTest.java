package methodpattern;

public class StrategyMethodTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Context context = new Context(new StrategyA());
		context.arg1 = "strategyA";
		context.useAlgorithm();

	}

}
