package factorypattern;

public abstract class AbstractFactory {
	protected Operation op;
	
	public  abstract Operation createOperation();
}
