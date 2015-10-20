package methodpattern;

public class StrategyB extends Strategy {

	@Override
	public void useAlgorithm(Context context) {
		// TODO Auto-generated method stub
		System.out.println("use StrategyB  " + context.arg1);
	}

}
