package chain_of_responsibility_pattern;

public class ConcreteHandler extends AbstractHandler {

	@Override
	public void handleRequest(int request) {
		// TODO Auto-generated method stub
		if (request >= 0 && request < 10) {
			System.out.println("ConcreteHandler handle the request!");
		} else if (this.getSuccessor() != null) {//�����ְ�����л�������һ��successor,�����󴫵ݵ���һ��successor�����������handler�д���
			this.getSuccessor().handleRequest(request);
		}
	}

}
