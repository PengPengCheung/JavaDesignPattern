package CommandPattern.AndroidListenerCommandPattern;

/*
 * 相当于一个View基类，可以由其他控件继承
 * */
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
