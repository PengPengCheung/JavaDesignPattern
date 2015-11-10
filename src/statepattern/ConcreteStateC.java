package statepattern;

public class ConcreteStateC extends State {

	@Override
	public void handle(Context context) {
		// TODO Auto-generated method stub
		context.setState(new ConcreteStateA());
		System.out.println("set next StateA");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "StateC";
	}

}
