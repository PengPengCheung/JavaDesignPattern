package mediatorpattern;

/*
 *中介者模式优点：减少各个Colleague的耦合，可以使其独立改变和复用，同时各个Colleague类只需要和中介者通讯，而无需和其他Colleague进行通讯
 *缺点：ConcreteMediator将交互集中在一个类中，这也使得中介者类变得复杂得多，也不容易维护
 *中介者模式一般应用于一组已定义良好但是通信方式复杂的对象，以及想定制一个分布在多个类中的行为而又不想生成太多子类的场合
 *当系统中出现多对多交互复杂的对象时，先考虑系统的设计是否合理，再考虑用中介者模式
 */
public class ConcreteMediator implements Mediator {
	private ConcreteColleague1 colleague1;
	private ConcreteColleague2 colleague2;
	
	public void setColleague1(ConcreteColleague1 colleague1) {
		this.colleague1 = colleague1;
	}

	public void setColleague2(ConcreteColleague2 colleague2) {
		this.colleague2 = colleague2;
	}
	
	/*
	 * 参数colleague代表了发送方，如果发送方是colleague1,则由colleague2进行接收，如果不是则由colleague1接收
	 * */
	@Override
	public void send(String message, Colleague colleague) {
		// TODO Auto-generated method stub
		if(colleague == colleague1){
			colleague2.receive(message);
		}else {
			colleague1.receive(message);
		}
	}

}
