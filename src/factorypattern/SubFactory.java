package factorypattern;

public class SubFactory extends AbstractFactory {

	@Override
	public Operation createOperation() {
		// TODO Auto-generated method stub
		op = new SubOperation();
		return op;
	}

}
