package mediatorpattern;

public class MediatorPatternTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//因为没有set方法，所以定义具体的实现类而不是定义抽象接口Mediator
		ConcreteMediator mediator = new ConcreteMediator();
		
		//将mediator关联到colleague1和2中
		//可以都定义为Colleague类但是对于后面mediator的设置方法来说并不能有将参数传入，因此定义具体的实现类
		ConcreteColleague1 colleague1 = new ConcreteColleague1(mediator);
		ConcreteColleague2 colleague2 = new ConcreteColleague2(mediator);
		
		//将colleague1和colleague2关联到mediator中，两者都互相关联
		//这里用抽象类Colleague作为参数传入的时候不能set多个不同的类，因此分开定义不同的具体实现类
		mediator.setColleague1(colleague1);
		mediator.setColleague2(colleague2);
		
		//此时的send方法只负责将消息发送到mediator，实际上是调用了mediator中的send
		colleague1.send("hello colleague2!");
		colleague2.send("colleague2 has received the message from colleague1!");
	}

}
