package chain_of_responsibility_pattern;

public class ConcreteHandler2 extends AbstractHandler {

	@Override
	public void handleRequest(int request) {
		// TODO Auto-generated method stub
		if (request >= 10 && request < 20) {
			System.out.println("ConcreteHandler2 handle the request!");
		} else if (this.getSuccessor() != null) {//�����ְ�����л�������һ��successor,�����󴫵ݵ���һ��successor�����������handler�д���
			this.getSuccessor().handleRequest(request);
		}
	}

}
