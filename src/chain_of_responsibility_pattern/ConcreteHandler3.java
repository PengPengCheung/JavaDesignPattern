package chain_of_responsibility_pattern;

public class ConcreteHandler3 extends AbstractHandler {

	@Override
	public void handleRequest(int request) {
		// TODO Auto-generated method stub
		if (request >= 20) {
			System.out.println("ConcreteHandler3 handle the request!");
		} else if (this.getSuccessor() != null) {//�����ְ�����л�������һ��successor,�����󴫵ݵ���һ��successor�����������handler�д���
			this.getSuccessor().handleRequest(request);
		}
	}

}
