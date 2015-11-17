package chain_of_responsibility_pattern;

public class ChainOfResponsibilityPatternTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractHandler handler = new ConcreteHandler();
		AbstractHandler handler2 = new ConcreteHandler2();
		AbstractHandler handler3 = new ConcreteHandler3();
		
		//����ְ�����е���һ��������Ľ�ɫ�����û����һ����ɫ���ɵ�ǰ��ɫ��������д���
		handler.setSuccessor(handler2);
		handler2.setSuccessor(handler3);
		
		int[] request = {2, 45, 13, 12, 20, 234, 4};
		
		for(int num:request){
			handler.handleRequest(num);
		}
		
	}

}
