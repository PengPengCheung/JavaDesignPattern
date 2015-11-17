package mediatorpattern;

public class MediatorPatternTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcreteMediator mediator = new ConcreteMediator();
		
		//将mediator关联到colleague1和2中
		ConcreteColleague1 colleague1 = new ConcreteColleague1(mediator);
		ConcreteColleague2 colleague2 = new ConcreteColleague2(mediator);
		
		//将colleague1和colleague2关联到mediator中，两者都互相关联
		mediator.setColleague1(colleague1);
		mediator.setColleague2(colleague2);
		
		//此时的send方法只负责将消息发送到mediator，实际上是调用了mediator中的send方法
		colleague1.send("hello colleague2!");
		colleague2.send("colleague2 has received the message from colleague1!");
	}

}
