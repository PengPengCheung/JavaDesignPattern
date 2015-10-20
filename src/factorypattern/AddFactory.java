package factorypattern;

public class AddFactory extends AbstractFactory {

	@Override
	public  Operation createOperation() {
		// TODO Auto-generated method stub
		op = new AddOperation();
		return op;
	}

}
