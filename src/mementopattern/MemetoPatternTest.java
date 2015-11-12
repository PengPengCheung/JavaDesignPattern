package mementopattern;

public class MemetoPatternTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Originator originator = new Originator();
		originator.setState("ON");//����originator��״̬
		
		//����Ҫ��ʱ���ʵ����Memeto��Ȼ��originator�����ݱ��ݵ�CareTaker ����
		CareTaker caretaker = new CareTaker();
		caretaker.setMemeto(originator.createMemeto());
		
		//��״̬�ı�ʱ����Ҫ�ָ�ԭ�е�״̬���ʹ�CareTaker������ȡ�ر�������
		originator.setState("OFF");
		originator.recoverMemeto(caretaker.getMemeto());
	}

}
