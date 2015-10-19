package CommandPattern;

public class TestClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Receiver receiver = new Receiver();
		Invoker invoker = new Invoker();
//		Command command = new ConcreteCommand(receiver);
		invoker.setCommand(new ConcreteCommand(receiver));
		invoker.Execute();
	}

}
