package mediatorpattern;

/*
 *�н���ģʽ�ŵ㣺���ٸ���Colleague����ϣ�����ʹ������ı�͸��ã�ͬʱ����Colleague��ֻ��Ҫ���н���ͨѶ�������������Colleague����ͨѶ
 *ȱ�㣺ConcreteMediator������������һ�����У���Ҳʹ���н������ø��ӵö࣬Ҳ������ά��
 *�н���ģʽһ��Ӧ����һ���Ѷ������õ���ͨ�ŷ�ʽ���ӵĶ����Լ��붨��һ���ֲ��ڶ�����е���Ϊ���ֲ�������̫������ĳ���
 *��ϵͳ�г��ֶ�Զཻ�����ӵĶ���ʱ���ȿ���ϵͳ������Ƿ�����ٿ������н���ģʽ
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
	 * ����colleague�����˷��ͷ���������ͷ���colleague1,����colleague2���н��գ������������colleague1����
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
