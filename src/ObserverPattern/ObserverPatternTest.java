package ObserverPattern;

public class ObserverPatternTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ʵ����������������
		Subject subject = new ConcreteSubject();
		
		//ʵ��������Ĺ۲��߶���
		Observerable observer1 = new ConcreteObserver();
		Observerable observer2 = new ConcreteObserver();
		Observerable observer3 = new ConcreteObserver();
		
		//��������۲���
		subject.Attach(observer1);
		subject.Attach(observer2);
		subject.Attach(observer3);
		
		//�����ⷢ������ʱ��֪ͨ���й۲���������Ӧ
		subject.Notify();
		
		//����۲���2�Ĺ���
		subject.Detach(observer2);
		System.out.println("----------------");
		subject.Notify();
	}

}
