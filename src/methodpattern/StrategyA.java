package methodpattern;

public class StrategyA extends Strategy {

	@Override
	public void useAlgorithm(Context context) {
		// TODO Auto-generated method stub
		
		System.out.println("use StrategyA  " + context.arg1);

	}

}
