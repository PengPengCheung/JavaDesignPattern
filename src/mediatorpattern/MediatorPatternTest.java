package mediatorpattern;

public class MediatorPatternTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��Ϊû��set���������Զ�������ʵ��������Ƕ������ӿ�Mediator
		ConcreteMediator mediator = new ConcreteMediator();
		
		//��mediator������colleague1��2��
		//���Զ�����ΪColleague�൫�Ƕ��ں���mediator�����÷�����˵�������н��������룬��˶�������ʵ����
		ConcreteColleague1 colleague1 = new ConcreteColleague1(mediator);
		ConcreteColleague2 colleague2 = new ConcreteColleague2(mediator);
		
		//��colleague1��colleague2������mediator�У����߶��������
		//�����ó�����Colleague��Ϊ���������ʱ����set�����ͬ���࣬��˷ֿ����岻ͬ�ľ���ʵ����
		mediator.setColleague1(colleague1);
		mediator.setColleague2(colleague2);
		
		//��ʱ��send����ֻ������Ϣ���͵�mediator��ʵ�����ǵ�����mediator�е�send
		colleague1.send("hello colleague2!");
		colleague2.send("colleague2 has received the message from colleague1!");
	}

}
