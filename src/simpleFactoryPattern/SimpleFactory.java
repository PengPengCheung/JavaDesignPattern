package simpleFactoryPattern;

public class SimpleFactory {
	public static Operation createOpertion(char operStr) {
		Operation op = null;
		switch (operStr) {
		case '+': {
			op = new AddOperation();
			break;
		}
		case '-': {
			op = new SubOperation();
			break;
		}
		case '*': {
			op = new MulOperation();
			break;
		}
		case '/': {
			op = new DivOperation();
			break;
		}
		default:break;
		}

		return op;
	}
}
