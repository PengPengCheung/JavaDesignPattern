package CommandPattern;

public class Invoker {
	protected Command command;
	
	public Invoker(){
		
	}
	
	public void setCommand(Command command){
		this.command = command;
	}
	
	public void Execute(){
		command.Execute();
	}
}
