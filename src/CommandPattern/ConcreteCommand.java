package CommandPattern;

public class ConcreteCommand extends Command{
	private Receiver receiver;
	
	public ConcreteCommand(Receiver r){
			this.receiver = r;
		
	}

	public void Execute() {
		receiver.Action();
	}
}
