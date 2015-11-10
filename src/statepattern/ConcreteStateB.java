package statepattern;

public class ConcreteStateB extends State {

	@Override
	public void handle(Context context) {
		// TODO Auto-generated method stub
		context.setState(new ConcreteStateC());
		System.out.println("set next StateC");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "StateB";
	}

}
