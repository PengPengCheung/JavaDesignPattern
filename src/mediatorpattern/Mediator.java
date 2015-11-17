package mediatorpattern;

public interface Mediator {
	public void send(String message, Colleague colleague);//这里的colleague是指发送的一方
}
