package factorypattern;

public class AddOperation extends Operation {

	@Override
	public double getResult() {
		// TODO Auto-generated method stub
		result = getNumA() + getNumB();
		return result;
	}

}
