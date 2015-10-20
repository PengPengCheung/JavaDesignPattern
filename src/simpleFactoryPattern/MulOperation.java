package simpleFactoryPattern;

public class MulOperation extends Operation {

	@Override
	public double getResult() {
		// TODO Auto-generated method stub
		result = getNumA() * getNumB();
		return result;
	}

}
