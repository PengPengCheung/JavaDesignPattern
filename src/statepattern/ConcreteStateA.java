package statepattern;

public class ConcreteStateA extends State {

	@Override
	public void handle(Context context) {
		// TODO Auto-generated method stub
		context.setState(new ConcreteStateB());
		System.out.println("set next StateB");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "StateA";
	}

}
