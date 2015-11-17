package mediatorpattern;

public class ConcreteColleague2 extends Colleague {

	public ConcreteColleague2(Mediator mediator) {
		super(mediator);
		// TODO Auto-generated constructor stub
	}
	
	public void send(String message){
		mediator.send(message, this);
	}
	
	public void receive(String message){
		System.out.println("Colleague2 has received the message: "+message);
	}
}
